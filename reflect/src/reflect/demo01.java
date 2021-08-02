package reflect;

import java.lang.reflect.Field;

public class demo01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//获取成员变量
		
		Class cls = Person.class;
		// Field[] getFields()  获取所有public成员变量
		Field[] fs = cls.getFields();
		for(Field f : fs )
		{
			System.out.println(f);
		}
		System.out.println("----------------------------------");
		
		// Field getField(String name)  获取指定的public成员变量
		Field f0 = cls.getField("a");
		System.out.println(f0);
		System.out.println("----------------------------------");
		
		// Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
		fs = cls.getDeclaredFields();
		for(Field f : fs )
		{
			System.out.println(f);
		}
		System.out.println("----------------------------------");
		
		// Field getDeclaredField(String name)  获取指定的成员变量
		f0 = cls.getDeclaredField("b");
		System.out.println(f0);
		System.out.println("----------------------------------");
		
		// String getName()  获取类名
		String name = cls.getName();
		System.out.println(name);
		System.out.println("----------------------------------");
		
		// 对Field对象的操作
		//1.get   2.set    3.暴力反射
		
		// 获取成员变量a
		Field a = cls.getDeclaredField("a");
		// 设置对象的a的值 void set(Object obj, Object value)
		// 若成员变量为private类型，则会报错，需要忽略访问权限修饰符的安全检查
		//即暴力反射 void setAccessible(true)
		Person p = new Person();
		a.setAccessible(true);
		a.set(p,"张三");
		System.out.println(p);
		
		// Object get(Object obj)  获取值
		Object obj = a.get(p);
		System.out.println(obj);
	}

}
