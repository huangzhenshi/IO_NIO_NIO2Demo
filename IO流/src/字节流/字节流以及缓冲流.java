package 字节流;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流以及缓冲流 {
	
	public static void main(String[] args){  
		copyBmp();
    }  
	
	  //字节流复制图片
	  public static void copyBmp() {  
		  
	        FileInputStream fis = null;  
	        FileOutputStream fos = null;  
	        try {  
	            fis = new FileInputStream("C:\\Users\\502764158\\Desktop\\yycf.jpg");             //写入流关联文件  
	            fos = new FileOutputStream("C:\\Users\\502764158\\Desktop\\yycf_copy.jpg");            //读取流关联文件  
	            byte[] copy = new byte[1024];  
	            int len = 0;  
	            while((len=fis.read(copy))!=-1) {  
	            fos.write(copy,0,len);  
	            }  
	        }  
	        catch (IOException e) {  
	            e.printStackTrace();  
	            throw new RuntimeException("复制文件异常");  
	        }  
	        finally {  
	            try {  
	                if(fis!=null) fis.close();  
	            }  
	            catch (IOException e) {  
	                e.printStackTrace();  
	                throw new RuntimeException("读取流");  
	            }  
	        }  
	          
	    }  
	  

}


