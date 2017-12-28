package 字符流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 缓冲字符流 {
	public static void main(String[] args)  throws IOException {  
		bufferRead();
    }  
	
	public static void bufferWrite() throws IOException{
		 FileWriter fw = new FileWriter("C:\\Users\\502764158\\Desktop\\io\\1.txt");  
	        
	        //为了提高字符写入效率，加入了缓冲技术。  
	        //只要将需要被提高效率的流作为参数传递给缓冲区的构造函数即可  
	        BufferedWriter bfw = new BufferedWriter(fw);  
	  
	        //bfw.write("abc\r\nde");  
	        //bfw.newLine();               这行代码等价于bfw.write("\r\n"),相当于一个跨平台的换行符  
	        //用到缓冲区就必须要刷新  
	        for(int x = 1; x < 5; x++) {  
	            bfw.write("abc");  
	            bfw.newLine();                  //java提供了一个跨平台的换行符newLine();  
	            bfw.flush();  
	        }  
	  
	  
	  
	        bfw.flush();                                                //刷新缓冲区  
	        bfw.close();                                                //关闭缓冲区，但是必须要先刷新  
	  
	        //注意，关闭缓冲区就是在关闭缓冲中的流对象  
	        fw.close();   
	}
	
	public  static void bufferRead()throws IOException{
		 //嵌套上缓冲流后，调用 readLine()方法 方便操作
        FileReader rw = new FileReader("C:\\Users\\502764158\\Desktop\\io\\1.txt");  
        BufferedReader brw = new BufferedReader(rw);  
        for(;;) {  
            String s = brw.readLine();  
            if(s==null) break;  
            System.out.println(s);  
        }  
        brw.close();//关闭输入流对象
	}
}
