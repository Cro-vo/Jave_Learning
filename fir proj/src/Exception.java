import java.util.Scanner;
import java.lang.*;

// 如果函数可能发生异常，则必须在函数头部加以声明（throws）
// 子类覆盖父类的成员函数时，不能声明比父类函数更多的异常
// 子类的构造函数必须包含父类构造函数的异常

// 使用throw将异常抛出后，若是RuntimeException或其子类对象，
// ,可默认不处理;若是编译异常，则需要对异常进行处理:
//	1.在方法头部声明throws对象，丢给上一级处理
//  2.使用try...catch语句处理异常

// 多异常
// 1. 一个try 多个catch
//    catch里定义的异常变量，如果有父子关系，
// 	  子类要写在父类的上面（异常对象会依次赋值给catch中的异常变量）

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test01();
		test02();
		
	}

	private static void test02() {
		// TODO Auto-generated method stub
		int []a = new int[10];
		int num = getElement(a,0);
		
		System.out.println(num);
		
		
	}
	
	

	private static int getElement(int[] a, int i) {
		// TODO Auto-generated method stub
		
		if (a == null)
		{
			throw new NullPointerException("数组为null");
		}
		
		if (i >= a.length || i < 0)
		{
			throw new ArrayIndexOutOfBoundsException("数组越界");
		}
		
		int num = a[i];
//		int num;
//		try {
//			num = a[i];
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			num = 99;
//		}
		return num;
		
	}

	private static void test01() {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		int age = 0;
		
		// try-catch语句
		try {
			age = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			age = 10;
//			e.printStackTrace();
//			e.getMessage();
		}
		
		System.out.println(age);
		in.close();
	}

}
