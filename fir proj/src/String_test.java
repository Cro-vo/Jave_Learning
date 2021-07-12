
import java.util.Scanner;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 初始化
		Scanner in = new Scanner(System.in);
		
		// String类为字符串的管理者而非所有者
		// 字符串初始化
		String str = new String("hello world");
		String str1 = "Hello world";
		
		// in.next() 读取一个单词
 		// in.nextLine() 读取一行
		str = in.next();
		System.out.println(str);
		str = in.nextLine();
		System.out.println(str);
		
		// 字符串判断相等 str.equals()
		str.equals(str1);
		
//—————————————————————————字符串操作—————————————————————————————	
		// 字符串大小比较 str.compareTo(String);
		// (无视大小写)	str.compareToIgnoreCase(String);
		// 字符串在索引处的字符 str.charAt(index);
		
		// 获得子串 str.substring();
		
		// 查找字符 str.indexOf(); str.lastIndexOf();
		
		// 判断是否以string为开始 str.startsWith(String);
		// 判断是否以string为开始 str.endsWith(String);
		// 去除前后空格 str.trim();
		// 替换 str.replace(c1, c2);
		// 小写 str.toLowerCase();
		// 大写 str.toUpperCase();
		
		
		
		
		
		
		
		
//		System.out.println(str+"\n"+str1);
		
	}

}