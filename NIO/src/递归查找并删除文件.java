import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


public class 递归查找并删除文件 {
	
	static String fileAddress="C:\\Users\\502764158\\Desktop\\io";
	public static void main(String[] argus) throws Exception{
			Path rootPath = Paths.get(fileAddress);  
			final String fileToFind = ".txt";  
			  
			try {  
			  Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>() {  
			    @Override  
			    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {  
			      String fileString = file.toAbsolutePath().toString();  
			      if(fileString.endsWith(fileToFind)){  
			        System.out.println("file found at path: " + file.toAbsolutePath());

			    	  Files.delete(Paths.get(fileString)); 
			      }  
			      return FileVisitResult.CONTINUE;  
			    }  
			  });  
			} catch(IOException e){  
			    e.printStackTrace();  
			}  
		}
}
