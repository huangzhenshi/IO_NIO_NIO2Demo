package 字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 字符流读写 {
	public static void main(String[] args) throws IOException{             //需要对IO异常进行处理   
		/*writeTextToATextFile();*/
		singleReader();
  
    }  
	
	//实现字符文本的持久化到文档中 
	//FileWriter 类
	public static void writeTextToATextFile() throws IOException{
		//创建一个FileWriter对象，该对象一被初始化就必须要明确被操作的文件。  
        //而且该文件会被创建到指定目录下。如果该目录有同名文件，那么该文件将被覆盖。  
        FileWriter fw = new FileWriter("C:\\Users\\502764158\\Desktop\\io\\1.txt");
        fw.write("hello world世界!");   
        fw.flush();  
  
        //关闭流资源，但是关闭之前会刷新一次内部缓冲中的数据。当我们结束输入时候，必须close();  
        fw.write("first_test");  
        fw.close();  
        //flush和close的区别：flush刷新后可以继续输入，close刷新后不能继续输入。  
	}
	
	
	/*****************字符数组进行读取*********************/  
	//FileReader.read(buf) 把读取的文字取6个字节到buf数组中
    private static void characters() {  
  
        try {  
  
            FileReader fr = new FileReader("C:\\Users\\502764158\\Desktop\\io\\1.txt");  
            char []  buf = new char[6];   
            //将Denmo中的文件读取到buf数组中。
            //一次读取6个字节，当读到最后一个字节时返回-1
            int num = 0;      
            while((num = fr.read(buf))!=-1) {  
  
                //String(char[] value , int offest,int count) 分配一个新的String,包含从offest开始的count个字符  
                sop(new String(buf,0,num));  
            }  
            sop('\n');  
            fr.close();  
        }  
        catch (IOException e) {  
            sop(e.toString());  
        }  
    }  
  
  
  
  
  
  
/*****************单个字母读取*************************/  
    private static void singleReader() {  
          
        try {  
  
            //创建一个文件读取流对象，和指定名称的文件关联。  
            //要保证文件已经存在，否则会发生异常：FileNotFoundException  
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
