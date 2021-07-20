import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arraylist_test();
//		linkedlist_test();
		hashmap_test();
		
	}

	public static void arraylist_test()
	{
//		ArrayList<Integer> list = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		//使用迭代器遍历
		Iterator<Integer> it = list.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		//for循环遍历
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	public static void linkedlist_test()
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(5);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static void hashmap_test()
	{
		HashMap<String, String> map = new HashMap<>();
		map.put("张三", "男");
		map.put("李红", "女");
		map.put("王五", "男");
		
		Set<String> keyset = map.keySet();
		Collection<String> valueset = map.values();
		
		Iterator<String> it = keyset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it = valueset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
