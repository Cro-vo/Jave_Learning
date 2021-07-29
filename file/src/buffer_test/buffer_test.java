package buffer_test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class buffer_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		test01();
//		test02();
//		test03();
//		test04();
		test05();
		
	}
	
	// 对文字段进行排序
	private static void test05() throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
				new FileReader("in.txt"));
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("out.txt"));
		String line = null;
		HashMap<String, String> map = new HashMap<>(); // map中key为数字会自动排序
		
		while((line = br.readLine()) != null)
		{
			String[] s = line.split("\\.");
//			System.out.println(s[0] + s[1]);
			map.put(s[0], s[1]);
		}
		
		for(String key : map.keySet())
		{
			bw.write(map.get(key).toLowerCase());
		}
		bw.flush();
		bw.close();

	}

	// BufferedReader使用，特有方法readLine()
	private static void test04() throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
				new FileReader("1.txt"));
		String line = null;
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		
	}

	// BufferedWriter使用，特有方法newLine()
	private static void test03() throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("1.txt"));
		bw.write("hello world!");
		bw.newLine();				// BufferedWriter对象特有方法，用于换行
		bw.write("你好");
		bw.flush();
		bw.close();
	}

	// 复制文件
		private static void test02() throws IOException {
			// TODO Auto-generated method stub
			long startTime = System.currentTimeMillis();
			FileInputStream fis = new FileInputStream("ttt.jpg");
			FileOutputStream fos = new FileOutputStream("src\\ttt.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			
			// 法一：单个字节复制
//			int len = 0;
//			while((len = bis.read()) != -1)
//			{
//				bos.write(len);
//			}
			
			// 法二：字节数组复制
			byte [] b = new byte[1024];
			int len = 0;
			while((len = bis.read(b)) != -1)
			{
				bos.write(b);
			}
			
			
//			fis.close();
//			fos.close();
			bis.close();
			bos.close();
			
			long endTime = System.currentTimeMillis();
			System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
		}
		
		public static void test01() throws IOException
		{
			// 创建FileOutputStream对象
			FileOutputStream fos = new FileOutputStream("1.txt");
			// 创建缓冲流对象
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			// 写入内容到缓冲区
			bos.write("Hello world!".getBytes());
			// 将缓冲区内容写入文件
			bos.flush();
			bos.close();
		}

}
