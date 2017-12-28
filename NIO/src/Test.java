import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Test {
	static String fileAddress="C:\\Users\\502764158\\Desktop\\io\\hello.txt";
	
	public static void main(String[] argus) throws Exception{
		
		readAllNIO2();
		
		
	}
	
	public static void readAllNIO2() throws Exception{
		Path file=Paths.get(fileAddress);
		List<String> list=Files.readAllLines(file, StandardCharsets.UTF_8);
		
		
	}
	
	public static void channels() throws Exception{
		RandomAccessFile fromFile = new RandomAccessFile(fileAddress, "rw");  
		FileChannel      fromChannel = fromFile.getChannel();  
		  
		RandomAccessFile toFile = new RandomAccessFile("C:\\Users\\502764158\\Desktop\\io\\hello-to.txt", "rw");  
		FileChannel      toChannel = toFile.getChannel();  
		  
		long position = 0;  
		long count    = fromChannel.size();  
		  
		toChannel.transferFrom(fromChannel, position, count);  
	}
	
	//NIO2.0“ª¥Œ∂¡»°all Lines
	public void testNIOAllread() throws IOException{
		Path path=Paths.get(fileAddress);
		List<String> lines=Files.readAllLines(path, StandardCharsets.UTF_8);
		for(String line:lines){
			System.out.println(line);
		}
		
	}
	
	
	public static void  testChannel() throws Exception{
		RandomAccessFile aFile = new RandomAccessFile(fileAddress, "rw");  
	    FileChannel inChannel = aFile.getChannel();  
	  
	    ByteBuffer buf = ByteBuffer.allocate(40);
	    ByteBuffer buf2 = ByteBuffer.allocate(40);
	    ByteBuffer[] bufferArray = { buf, buf2 };  
	    int bytesRead = (int) inChannel.read(bufferArray);  
	    while (bytesRead != -1) {  
	  
	      System.out.println("Read " + bytesRead);  
	      buf.flip();  
	      buf2.flip();  
	  
	      while(buf.hasRemaining()){  
	          System.out.print((char) buf.get());  
	      }  
	      while(buf2.hasRemaining()){  
	          System.out.print((char) buf2.get());  
	      }
	      
	      
	  
	      buf.clear();  
	      bytesRead = inChannel.read(buf);  
	    }  
	    aFile.close();  
	}
	
}
