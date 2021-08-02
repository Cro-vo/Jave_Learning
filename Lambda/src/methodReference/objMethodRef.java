package methodReference;

import java.util.function.Consumer;

public class objMethodRef {
	
	// 定义类的静态方法
	public static void printAbs(int num)
	{
		System.out.println(Math.abs(num));
	}
	
	// 定义测试方法
	public static void test01(int num, Consumer<Integer> con)
	{
		con.accept(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Hello world!";
		// lambda表达式
		printString(string, (s)->{
			// 创建TestClass对象并使用成员方法
			TestClass tc = new TestClass();
			tc.printUpCaseString(s);
		});
		
		// 方法引用(对象及方法存在)
		TestClass tc = new TestClass();
		printString(string,tc::printUpCaseString);
		
		// lambda 和 方法引用（类静态成员函数）
		test01(-10, (n)->{
			objMethodRef.printAbs(n);
		});
		
		test01(-10, objMethodRef::printAbs);
		
	}

	
	// 定义接口
	public interface Printable
	{
		public abstract void print(String s);
	}
	
	public static void printString(String s,Printable p)
	{
		p.print(s);
	}

}

//定义类及成员方法
class TestClass
{
	public void printUpCaseString(String s)
	{
		System.out.println(s.toUpperCase());
	}
}
