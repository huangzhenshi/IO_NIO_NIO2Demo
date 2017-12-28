import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class 文件复制的3种操作 {
	
	static String fileAddress="C:\\Users\\502764158\\Desktop\\io\\hello.txt";
	public static void main(String[] argus) throws Exception{
		IOCopy();
		NIO1CopyFile() ;
		NIO2CopyFile();
	}
	
	public static void IOCopy() throws Exception{
		FileWriter fw = new FileWriter("C:\\Users\\502764158\\Desktop\\io\\hello-iowrite.txt");
		FileReader fr = new FileReader(fileAddress);
		char []  buf = new char[1024]; 
		int num = 0;	
		while((num = fr.read(buf))!=-1) {
			fw.write(new String(buf,0,num));
		}
		fr.close();
		fw.close();
	}
	
	public static void NIO1CopyFile() throws Exception{
		RandomAccessFile fromFile = new RandomAccessFile(fileAddress, "rw");  
		FileChannel      fromChannel = fromFile.getChannel();  
		RandomAccessFile toFile = new RandomAccessFile("C:\\Users\\502764158\\Desktop\\io\\hello-nio.txt", "rw");  
		FileChannel      toChannel = toFile.getChannel();  
		long position = 0;  
		long count    = fromChannel.size();  
		toChannel.transferFrom(fromChannel, position, count);  
	}
	
	public static void NIO2CopyFile()throws Exception{
		Path sourcePath= Paths.get(fileAddress);  
		Path descPath= Paths.get("C:\\Users\\502764158\\Desktop\\io\\hello-nio2.txt");  
		Files.copy(sourcePath, descPath);  
	}
}
