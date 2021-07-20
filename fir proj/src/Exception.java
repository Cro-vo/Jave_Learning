import java.util.Scanner;

// 如果函数可能发生异常，则必须在函数头部加以声明（throws）
// 子类覆盖父类的成员函数时，不能声明比父类函数更多的异常
// 子类的构造函数必须包含父类构造函数的异常

public class Exception {

	public static void main(String[] args) {
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
		
	}

}
