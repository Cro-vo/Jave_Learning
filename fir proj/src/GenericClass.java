import java.util.ArrayList;
import java.util.Iterator;

public class GenericClass<E> {

	private E name;
	
	
	
	public E getName() {
		return name;
	}



	public void setName(E name) {
		this.name = name;
	}
	
	public <T> void show(T t)
	{
		System.out.println(t);
	}

	
	public void print()
	{
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> gc = new GenericClass();
		gc.setName(100);
		int num = gc.getName();
		System.out.println(num);
		
		gc.show(10000);
		gc.show("hello world");
		gc.show('c');
		
		
		// 泛型通配符
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Hello ");
		list1.add("World!");
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		
		print(list1);
		print(list2);
	}
	
	// 泛型通配符
	public static void print(ArrayList<?> list)
	{
		Iterator<?> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
