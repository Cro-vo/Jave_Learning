package stream;

import java.util.ArrayList;

public class demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 筛选并遍历列表
		ArrayList<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("张柳青");
		
		list.stream().filter((name)->{
			return name.startsWith("张");
		}).filter((name)->{
			return name.length()>=2;
		}).forEach((name)->{
			System.out.println(name);
		});
		
	}

}
