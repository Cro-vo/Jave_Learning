
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
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_test a = new Class_test();
		a.showBalance();
		a.showTotal();
	}

}
