package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class file_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		test01();
//		test02();
//		test03();
//		test04();
//		test05();
		test06();
	}
	
	// FileWriter
	private static void test06() throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("2.txt");
		fw.write("你好");
//		fw.flush();
		fw.close();
	}

	// FileReader
	private static void test05() throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\eclipse file\\first project\\file\\1.txt");
		int len = 0;
		while((len = fr.read()) != -1)
		{
			System.out.print((char)len);
		}
		fr.close();
	}

	// 复制文件
	private static void test04() throws IOException {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("ttt.jpg");
		FileOutputStream des = new FileOutputStream("src\\ttt.jpg");

		
		// 法一：单个字节复制
//		int len = 0;
//		while((len = fis.read()) != -1)
//		{
//			des.write(len);
//		}
		
		// 法二：字节数组复制，效率更高
		byte [] b = new byte[1024];
		int len = 0;
		while((len = fis.read(b)) != -1)
		{
			des.write(b);
		}
		
		
		fis.close();
		des.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
	}

	// File InputStream的使用
	private static void test03() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =
				new FileInputStream("D:\\\\eclipse file\\\\first project\\\\file\\\\1.txt");
		byte[] b = new byte[1024];	// 一般定义为1024的整数倍
		int len = 0;
		
		while((len = fis.read(b)) != -1)			// read(byte[])返回读取到的个数						
		{											// read()返回读取到的字节
			System.out.println(new String(b,0,len));	// String的构造方法可将byte数组转化
		}
		fis.close();
		
		
	}

	// FileOutputStream的使用
	public static void test02() throws IOException
	{
		// 文本的追加写需要在FileOutputStream构造函数中多加一个bool参数
		FileOutputStream fos =
				new FileOutputStream("D:\\eclipse file\\first project\\file\\1.txt");
		String str = "你\r\n好";
		fos.write(str.getBytes());			// String类的geyBytes可转化为数组
		System.out.println(Arrays.toString(str.getBytes()));
		fos.close();
	}
	
	// 创建、遍历文件夹
	public static void test01()
	{
		File f = new File("D:\\eclipse file\\first project\\file");
		
		// 创建文件/文件夹
//		try {
//			System.out.println(f.createNewFile());
//			System.out.println(f.mkdirs());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(f.delete());
		
		// 遍历文件夹
		String []list = f.list();
		File []files = f.listFiles();
		for (String i : list)
		{
			System.out.println(i);
		}
		for (File i : files)
		{
			System.out.println(i);
		}
	}

}
