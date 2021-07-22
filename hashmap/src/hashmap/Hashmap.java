package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> coins = new HashMap<Integer,String>();
		coins.put(1, "��");
		coins.put(10,"ë");
		coins.put(100,"Ԫ");
		
//		System.out.println(coins.get(10));
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("yyf", 11);
		map.put("yyf2", 13);
		map.put("yyf4", 17);
		System.out.println(map);
		
		Set<Entry<String, Integer>> enter = map.entrySet();
		System.out.println(enter);
		
		Iterator<Map.Entry<String, Integer>> it = enter.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
		
		
//		HashSet<String> hs = new HashSet<>();
//		hs.add("abc");
//		hs.add("重地");
//		hs.add("通话");
//		hs.add("abc");
//		String s1 = "重地";
//		String s2 = "通话";
//		String s3 = "abc";
//		
//		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + s3.hashCode());
//		Iterator<String> it = hs.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		HashMap<Person, String> map1 = new HashMap<>();
		
		map1.put(new Person("张三",19), "广东");
		map1.put(new Person("李四",14), "广西");
		map1.put(new Person("王五",20), "湖南");
		map1.put(new Person("张三",19), "四川");
		
		Set<Person> keys = map1.keySet();
		for(Person key : keys)
		{
			String value = map1.get(key);
			System.out.println(key + "-->" + value);
		}
		
		
				
		
	}

}
