package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class file_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		test01();
//		test02();
		test03();
	}
	
	// File InputStream的使用
	private static void test03() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =
				new FileInputStream("D:\\\\eclipse file\\\\first project\\\\file\\\\1.txt");
		int single = 0;
		
		while((single = fis.read()) != -1)
		{
			System.out.print((char)single);
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
