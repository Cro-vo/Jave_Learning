/*
在Java类中，普通函数需要加static，成为类的静态函数，才能在main中调用
								否则函数将变成类的成员函数
*/
public class Class_test {
	//成员变量
	int total;
	int balance=20;
	
	//构造函数
	Class_test()
	{
		total = 50;
	}
	
	//构造函数（带参）
	Class_test(int total)
	{
		this.total = total;
	}
	
	//成员函数
	void showTotal()
	{
		System.out.println("total = " + total);
	}
	void showBalance()
	{
		System.out.println("balance = " + balance);
	}
	
	
	// 重写父类Object的equals方法
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Class_test a = (Class_test)obj;
		return this.balance==a.balance&&this.total==a.balance;
	}
	
	//定义不定长函数
	public static int add(int...a)
	{
		int sum = 0;
		for (int x:a)
		{
			sum += x;
		}
		return sum;
	}
	
	//相对于不定长函数，优先调用此函数
	public static int add(int a)
	{
		return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_test a = new Class_test();
		Class_test b = new Class_test();
		a.showBalance();
		a.showTotal();
		System.out.println(a.equals(b));
		
		System.out.println(a instanceof Class_test);
		
		// 关键字 instanceof 示例
		Base base = new Base();
		Derive derive = new Derive();
		System.out.println(base instanceof Base);//true
		System.out.println(base instanceof Derive);//false
		System.out.println(derive instanceof Base);//true
		System.out.println(derive instanceof Derive);//true
		
		System.out.println(add(1,2));
	}

}

class Base
{
	
}

class Derive extends Base 
{
	
}