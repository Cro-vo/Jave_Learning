package reflect;

import java.lang.reflect.Constructor;

public class demo02 {
	public static void main(String[] args) throws Exception {
		// 获取方式与Field一样
		Class cls = Person.class;
		Constructor con = cls.getConstructor(String.class,int.class);
		// T newInstance(Object... initargs)  创建对象
		Object obj = con.newInstance("张三",18);
		System.out.println(obj);
		// 若是空参构造，可使用Class对象的方法newInstance()简化
		Object obj2 = cls.newInstance();
		System.out.println(obj2);
	}
}
