
//  匿名内部类的作用：简化代码
//		把子类继承父类，重写父类的方法，创建子类对象合一步完成
// 		把是实现类实现类接口，重写接口中的方法，创建实现类对象合一步完成
// 	匿名内部类的最终产物：子类/实现类对象，而这个类没有名字

//  格式：
//		new 父类/接口(){
//			重写父类/接口中的方法
//		};

public class OuterClass {
	innerClass in = new innerClass();
	public int num = 10;
	//内部类定义
	class innerClass
	{
		public int num = 20;
		innerClass(){
			
		}
		public void inf()
		{
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(OuterClass.this.num);
		}
		int y = 0;
	}
	
	
	public innerClass doit()
	{
//		y = 4;				//外部类直接访问内部类成员变量，会报错
		in.y = 4;
		return in;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass out = new OuterClass();
		//内部类的对象实例化必须在外部类（成员变量in）或外部类的非静态方法(doit)中实现
		OuterClass.innerClass in = out.doit();
		OuterClass.innerClass in2 = out.new innerClass();
//		System.out.println(in.y);
		in.inf();
	}

}
