package utf_gbk;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		utf_8();
		gbk();
	}

	private static void gbk() throws IOException {
		// TODO Auto-generated method stub
		// 写文件
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("gbk.txt"),"gbk");
		osw.write("你好");
		osw.flush();
		osw.close();
		
		// 读文件
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("gbk.txt"),"gbk");
		int len = 0;
		while((len = isr.read()) != -1)
		{
			System.out.print((char)len);
		}
		isr.close();
				
		
		
	}

	private static void utf_8() throws IOException {
		// TODO Auto-generated method stub
		// 写文件
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("utf_8.txt"),"utf-8");
		osw.write("你好");
		osw.flush();
		osw.close();
		
		// 读文件
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("utf_8.txt"),"utf-8");
		int len = 0;
		while((len = isr.read()) != -1)
		{
			System.out.print((char)len);
		}
		isr.close();
				
	}

}
