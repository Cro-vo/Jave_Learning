
public class array {

	public static void f(int a, int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("A = "+ a + ",B = " + b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		System.out.println("a = "+ a + ",b = " + b);
		f(a, b);
		System.out.println("a = "+ a + ",b = " + b);
	}

}
