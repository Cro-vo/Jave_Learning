package FunctionalInterface;

import java.util.function.Predicate;

public class predicate_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// java.util.function.Predicate<T>
		// 该接口包含抽象方法 boolean	 test(T t)
		// 用于对某种类型的数据进行判断
		String s = "Hello World!";
		boolean b = checkString(s, (str)->{
			return s.length()>5;
		});
		System.out.println(b);
		
		// 默认方法add()/or()/negate()
		boolean b2 = checkAnd(s,
				(str)->{
					return str.length()>5;
				},
				(str)->{
					return str.contains("a");
				});
		System.out.println(b2);
		
	}
	
	public static boolean checkString(String str, Predicate<String> pre)
	{
		return pre.test(str);
	}
	
	public static boolean checkAnd(String str, Predicate<String> pre1,
			Predicate<String> pre2)
	{
//		return pre1.test(str) && pre2.test(str);
		// 等价于
		return pre1.and(pre2).test(str);
	}

}
