package �ַ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class �����ַ��� {
	public static void main(String[] args)  throws IOException {  
		bufferRead();
    }  
	
	public static void bufferWrite() throws IOException{
		 FileWriter fw = new FileWriter("C:\\Users\\502764158\\Desktop\\io\\1.txt");  
	        
	        //Ϊ������ַ�д��Ч�ʣ������˻��弼����  
	        //ֻҪ����Ҫ�����Ч�ʵ�����Ϊ�������ݸ��������Ĺ��캯������  
	        BufferedWriter bfw = new BufferedWriter(fw);  
	  
	        //bfw.write("abc\r\nde");  
	        //bfw.newLine();               ���д���ȼ���bfw.write("\r\n"),�൱��һ����ƽ̨�Ļ��з�  
	        //�õ��������ͱ���Ҫˢ��  
	        for(int x = 1; x < 5; x++) {  
	            bfw.write("abc");  
	            bfw.newLine();                  //java�ṩ��һ����ƽ̨�Ļ��з�newLine();  
	            bfw.flush();  
	        }  
	  
	  
	  
	        bfw.flush();                                                //ˢ�»�����  
	        bfw.close();                                                //�رջ����������Ǳ���Ҫ��ˢ��  
	  
	        //ע�⣬�رջ����������ڹرջ����е�������  
	        fw.close();   
	}
	
	public  static void bufferRead()throws IOException{
		 //Ƕ���ϻ������󣬵��� readLine()���� �������
        FileReader rw = new FileReader("C:\\Users\\502764158\\Desktop\\io\\1.txt");  
        BufferedReader brw = new BufferedReader(rw);  
        for(;;) {  
            String s = brw.readLine();  
            if(s==null) break;  
            System.out.println(s);  
        }  
        brw.close();//�ر�����������
	}
}
