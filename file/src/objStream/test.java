package objStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import javax.print.PrintService;

public class test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		test01();
		test02();
	}

	private static void test02() throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps = new PrintStream("printstream.txt");
		ps.write(97); // 写入a   write()方法会根据编码表转化
		ps.println(97);// 写入97 print/println()方法数据原样输出
		
		
		System.setOut(ps);// 此静态方法可以改变输出的流向
		System.out.println("输出在printstream.txt文件中");
		
		ps.close();
	}

	private static void test01() throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		// 写对象到文件中
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("object.txt"));
		// 存入的对象必须实现Serializable接口
		person p = new person("张三",18);
		oos.writeObject(p);
		
		// 读对象
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("object.txt"));
		Object obj = ois.readObject();
//		System.out.println(obj);
		
		//--------------存储对象集合------------------
		ArrayList<person> list = new ArrayList<>();
		list.add(new person("张三",18));
		list.add(new person("李四",19));
		list.add(new person("王五",17));
		oos.writeObject(list);
		
		ArrayList<person> objs = (ArrayList<person>)ois.readObject();
		System.out.println(objs);
		

	}
}
