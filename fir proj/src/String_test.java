
import java.util.Scanner;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ʼ��
		Scanner in = new Scanner(System.in);
		
		// String��Ϊ�ַ����Ĺ����߶���������
		// �ַ�����ʼ��
		String str = new String("hello world");
		String str1 = "Hello world";
		
		// in.next() ��ȡһ������
 		// in.nextLine() ��ȡһ��
		str = in.next();
		System.out.println(str);
		str = in.nextLine();
		System.out.println(str);
		
		// �ַ����ж���� str.equals()
		str.equals(str1);
		
//���������������������������������������������������ַ�����������������������������������������������������������������	
		// �ַ�����С�Ƚ� str.compareTo(String);
		// (���Ӵ�Сд)	str.compareToIgnoreCase(String);
		// �ַ��������������ַ� str.charAt(index);
		
		// ����Ӵ� str.substring();
		
		// �����ַ� str.indexOf(); str.lastIndexOf();
		
		// �ж��Ƿ���stringΪ��ʼ str.startsWith(String);
		// �ж��Ƿ���stringΪ��ʼ str.endsWith(String);
		// ȥ��ǰ��ո� str.trim();
		// �滻 str.replace(c1, c2);
		// Сд str.toLowerCase();
		// ��д str.toUpperCase();
		
		
		
		
		
		
		
		
//		System.out.println(str+"\n"+str1);
		
	}

}
