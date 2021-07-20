
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
