package reflect;

import java.lang.reflect.Method;

public class demo03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		Class cls = Person.class;
		// 获取空参方法
		Method sleep_method = cls.getMethod("sleep");
		// 获取有参方法
		Method eat_method = cls.getMethod("eat", String.class);
		
		//				 调用对象     需要的参数
		// Object invoke(Object obj, Object... args)  （使用参数）调用方法
		sleep_method.invoke(p);
		eat_method.invoke(p, "米饭");
		
		// 获取方法名
		// String getName()
		
		// 注：getMethods中的方法包括父类Object中的方法
		
	}

}
