
import java.util.ArrayList;
import java.util.Scanner;

public class Hello {

	private int age;
	private String name;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("hello world!");

		// in.next() 读取一个单词
 		// in.nextLine() 读取一行
		// 读取内容
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextLine());
		
		// 变量存储
		int num = in.nextInt();
		System.out.println("100-" + num + "=" + (100-num));
		
	

	}



}