package �ַ���;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class �ַ�����д {
	public static void main(String[] args) throws IOException{             //��Ҫ��IO�쳣���д���   
		/*writeTextToATextFile();*/
		singleReader();
  
    }  
	
	//ʵ���ַ��ı��ĳ־û����ĵ��� 
	//FileWriter ��
	public static void writeTextToATextFile() throws IOException{
		//����һ��FileWriter���󣬸ö���һ����ʼ���ͱ���Ҫ��ȷ���������ļ���  
        //���Ҹ��ļ��ᱻ������ָ��Ŀ¼�¡������Ŀ¼��ͬ���ļ�����ô���ļ��������ǡ�  
        FileWriter fw = new FileWriter("C:\\Users\\502764158\\Desktop\\io\\1.txt");
        fw.write("hello world����!");   
        fw.flush();  
  
        //�ر�����Դ�����ǹر�֮ǰ��ˢ��һ���ڲ������е����ݡ������ǽ�������ʱ�򣬱���close();  
        fw.write("first_test");  
        fw.close();  
        //flush��close������flushˢ�º���Լ������룬closeˢ�º��ܼ������롣  
	}
	
	
	/*****************�ַ�������ж�ȡ*********************/  
	//FileReader.read(buf) �Ѷ�ȡ������ȡ6���ֽڵ�buf������
    private static void characters() {  
  
        try {  
  
            FileReader fr = new FileReader("C:\\Users\\502764158\\Desktop\\io\\1.txt");  
            char []  buf = new char[6];   
            //��Denmo�е��ļ���ȡ��buf�����С�
            //һ�ζ�ȡ6���ֽڣ����������һ���ֽ�ʱ����-1
            int num = 0;      
            while((num = fr.read(buf))!=-1) {  
  
                //String(char[] value , int offest,int count) ����һ���µ�String,������offest��ʼ��count���ַ�  
                sop(new String(buf,0,num));  
            }  
            sop('\n');  
            fr.close();  
        }  
        catch (IOException e) {  
            sop(e.toString());  
        }  
    }  
  
  
  
  
  
  
/*****************������ĸ��ȡ*************************/  
    private static void singleReader() {  
          
        try {  
  
            //����һ���ļ���ȡ�����󣬺�ָ�����Ƶ��ļ�������  
            //Ҫ��֤�ļ��Ѿ����ڣ�����ᷢ���쳣��FileNotFoundException  
            FileReader fr = new FileReader("C:\\Users\\502764158\\Desktop\\io\\1.txt");  
            int ch = 0;  
            while ((ch=fr.read())!=-1) {  
                sop((char)ch);  
            }  
            sop('\n');  
            fr.close();   
        }  
        catch (IOException e) {  
            sop(e.toString());  
        }  
      
    }  
  
  
	/**********************Println************************/  
	    private static void sop(Object obj) {  
	        System.out.print(obj);  
	    }  
	  
}
