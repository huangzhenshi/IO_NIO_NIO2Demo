package File��;

import java.io.File;

public class FileTest {
	//�г��ض�·�����ض���ʽ���ļ���
	 public static void main(String[] args){
	        File file=new File("C:\\Users\\502764158\\Desktop");
	        String[] str=file.list();
	        
	        for(String s : str){
	            if(s.endsWith(".txt") || s.endsWith(".docx")){//�����׺�����ָ�ʽ�ľ����
	                System.out.println(s);
	            }
	        }
	    }
}
