
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("hello world!");

		// 读取内容
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextLine());
		
		// 变量存储
		int num = in.nextInt();
		System.out.println("100-" + num + "=" + (100-num));

	}

}
