
public class Class_test {
	//��Ա����
	int total;
	int balance=20;
	
	//���캯��
	Class_test()
	{
		total = 50;
	}
	
	//���캯�������Σ�
	Class_test(int total)
	{
		this.total = total;
	}
	
	//��Ա����
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
