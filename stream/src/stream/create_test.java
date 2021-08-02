package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class create_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 法一：集合等对象直接使用stream方法
		ArrayList<String> list1 = new ArrayList<>();
		Stream<String> stream1= list1.stream();
		
		HashMap<String, String> map = new HashMap<>();
		Set<String> keySet = map.keySet();
		keySet.stream();
		Collection<String> values = map.values();
		values.stream();
		Set<Map.Entry<String, String>> ent = map.entrySet();
		ent.stream();
		
		// 法二：使用Stream静态方法of()
		Stream.of(1,2,3,4,5);
		Stream.of(list1);
	}

}
