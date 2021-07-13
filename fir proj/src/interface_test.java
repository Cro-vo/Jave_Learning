
public class interface_test implements int1 {
	
	public void print()
	{
		System.out.println("Hello world!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface_test it = new interface_test();
		it.print();
		
		// 接口的向上转型
		int1 it1 = new interface_test();
		it1.print();
				
	}

}

interface int1
{
	void print();
}