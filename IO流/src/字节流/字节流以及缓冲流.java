package �ֽ���;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class �ֽ����Լ������� {
	
	public static void main(String[] args){  
		copyBmp();
    }  
	
	  //�ֽ�������ͼƬ
	  public static void copyBmp() {  
		  
	        FileInputStream fis = null;  
	        FileOutputStream fos = null;  
	        try {  
	            fis = new FileInputStream("C:\\Users\\502764158\\Desktop\\yycf.jpg");             //д���������ļ�  
	            fos = new FileOutputStream("C:\\Users\\502764158\\Desktop\\yycf_copy.jpg");            //��ȡ�������ļ�  
	            byte[] copy = new byte[1024];  
	            int len = 0;  
	            while((len=fis.read(copy))!=-1) {  
	            fos.write(copy,0,len);  
	            }  
	        }  
	        catch (IOException e) {  
	            e.printStackTrace();  
	            throw new RuntimeException("�����ļ��쳣");  
	        }  
	        finally {  
	            try {  
	                if(fis!=null) fis.close();  
	            }  
	            catch (IOException e) {  
	                e.printStackTrace();  
	                throw new RuntimeException("��ȡ��");  
	            }  
	        }  
	          
	    }  
	  

}


