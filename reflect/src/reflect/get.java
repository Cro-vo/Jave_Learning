package reflect;

public class get {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 获取Class对象的方式：
		
		// 1.Class.forName("全类名") 将字节码文件加载进内存,返回Class对象
		// 多用于配置文件
		Class cls1 = Class.forName("reflect.Person");
		System.out.println(cls1);
		
		// 2.类名.class 通过类名属性class获取
		// 多用于参数的传递
		Class cls2 = Person.class;
		System.out.println(cls2);
		
		// 3.对象.getClass() 此方法在Object类中定义
		// 多用于对象获取的方式
		Person p = new Person();
		Class cls3 = p.getClass();
		System.out.println(cls3);
		
		// 不论通过哪种方式获取Class对象，获取的都是同一个对象 
	}

}
