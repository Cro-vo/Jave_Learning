package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		test01();
		
		
	}

	private static void test01() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.setProperty("aaa", "18");
		prop.setProperty("bbb", "19");
		prop.setProperty("ccc", "22");
		
		String age = prop.getProperty("aaa");
//		System.out.println(name);
//		Set<String> set = prop.stringPropertyNames();
//		System.out.println(set);
		
		// 字节流不能读写中文，需要使用字符流
		FileWriter fw = new FileWriter("D:\\eclipse file\\first project\\file\\1.txt");
		
		prop.store(fw, "modify");

		FileReader fr = new FileReader("D:\\eclipse file\\first project\\file\\1.txt");
		prop.load(fr);
		
		Set<String> set = prop.stringPropertyNames();
		System.out.println(set);
	}
	

}
