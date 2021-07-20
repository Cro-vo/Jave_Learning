
public class Derived extends Base1 {

	int num = 2;
	
	public void show()
	{
		System.out.println("Derived show");
	}
	
	public void showinde()
	{
		System.out.println(111);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 a = new Derived();
		System.out.println(a.num);
		a.show();
		
		// 向下转型
		Derived der = (Derived)a;
		der.showinde();
		der.show();
	}

}
