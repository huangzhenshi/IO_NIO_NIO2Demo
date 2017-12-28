package File包;

import java.io.File;

public class FileTest {
	//列出特定路径下特定格式的文件名
	 public static void main(String[] args){
	        File file=new File("C:\\Users\\502764158\\Desktop");
	        String[] str=file.list();
	        
	        for(String s : str){
	            if(s.endsWith(".txt") || s.endsWith(".docx")){//如果后缀是这种格式的就输出
	                System.out.println(s);
	            }
	        }
	    }
}
