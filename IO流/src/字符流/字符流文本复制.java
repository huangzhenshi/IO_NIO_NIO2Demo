package �ַ���;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class �ַ����ı����� {
	public static void main(String[] args) throws IOException {
		sop("������Ҫ�������ļ���·��:");
		Scanner in = new Scanner(System.in);
		String source = in.next();
		sop("��������Ҫ�������Ǹ�λ�õ�·���Լ����ɵ��ļ���:");
		String destination = in.next();
		in.close();
		CopyTextDemo(source,destination);

	}

/*****************�ļ�Copy*********************/
	private static void CopyTextDemo(String source,String destination) {

		try {
			FileWriter fw = new FileWriter(destination);
			FileReader fr = new FileReader(source);
			char []  buf = new char[1024]; 
			int num = 0;	
			while((num = fr.read(buf))!=-1) {
				fw.write(new String(buf,0,num));
			}
			fr.close();
			fw.close();
		}
		catch (IOException e) {
			sop(e.toString());
		}
	}



/**********************Println************************/
	private static void sop(Object obj) {
		System.out.println(obj);
	}
}
