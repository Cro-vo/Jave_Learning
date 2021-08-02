package FunctionalInterface;

import java.util.function.Consumer;

public class consumer_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 例：将名字反转
		// java.util.function.Consumer<T>
		// 该接口包含抽象方法 void accept(T t)
		// 用于处理某一类型的数据
		String s1 = "张三";
		String s2 = "abcde";
		
		deal(s1, (String name)->{
			 System.out.println(new StringBuilder(name).reverse().toString());;
		});
		
		// 若存在多个Consumer实现对象，可以使用andThen()方法
		deal2(s2,
				(t)->{
					System.out.println(t.toUpperCase());
				},
				(t)->{
					System.out.println(t.toLowerCase());
				});
		
		
	}
	
	public static void deal(String name, Consumer<String> con)
	{
		con.accept(name);
	}
	
	public static void deal2(String str, Consumer<String> con1, Consumer<String> con2)
	{
//		con1.accept(str);
//		con2.accept(str);
		// 等价于
		con1.andThen(con2).accept(str);
	}

}
