
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("hello world!");

		// ��ȡ����
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextLine());
		
		// �����洢
		int num = in.nextInt();
		System.out.println("100-" + num + "=" + (100-num));

	}

}
