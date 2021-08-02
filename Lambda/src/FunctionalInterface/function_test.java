package FunctionalInterface;

import java.util.function.Function;

public class function_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// java.util.Function<T,R>
		// 该接口包含抽象方法 R apply(T t)
		// 用于将T类型数据转换为R类型
		
		String s = "1234";
		
		Integer num = change(s, (str)->{
						return Integer.parseInt(str);
					});
		System.out.println(num);
		
	}
	
	public static Integer change(String str, Function<String, Integer> fun)
	{
		return fun.apply(str);
	}

}
