import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Card_Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();// 存放牌组
		HashMap<Integer, String> map = new HashMap<>();// 存放索引+牌组
		ArrayList<Integer> index = new ArrayList<>();// 存放索引
		
		ArrayList<Integer> player1num = new ArrayList<>();
		ArrayList<Integer> player2num = new ArrayList<>();
		ArrayList<Integer> player3num = new ArrayList<>();
		ArrayList<Integer> leftednum = new ArrayList<>();
		
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		ArrayList<String> lefted = new ArrayList<>();
		int k = 2;
		String[] a = {"♠", "♥", "♣", "♦"};

		String[] b = {"2", "A", "K", "Q",
				"J", "10", "9", "8",
				"7", "6", "5", "4", "3"};
		
		Collections.addAll(list, "大王","小王");
		Collections.addAll(index, 0,1);
		map.put(0, "大王");
		map.put(1, "小王");
		
		for (String i : b)
		{
			for (String j : a)
			{
				String str = j + i;
				list.add(str);
				index.add(k);
				map.put(k++, str);
			}
		}
		
//		System.out.println(list);
//		System.out.println(map);
//		System.out.println(index);
		
		Collections.shuffle(index);// 洗牌
		for (int i = 0; i < index.size(); i++)
		{
			if (i >= 51)
			{
				leftednum.add(index.get(i));
			}
			else if (i % 3 == 0) 
			{
				player1num.add(index.get(i));
			}
			else if (i % 3 == 1) 
			{
				player2num.add(index.get(i));
			}
			else if (i % 3 == 2) 
			{
				player3num.add(index.get(i));
			}
		}
		
		// 对牌进行排序
		sortCard(player1num);
		sortCard(player2num);
		sortCard(player3num);
		sortCard(leftednum);
		
		// 转换排好序的索引为牌组
		converCard(player1num,player1,map);
		converCard(player2num,player2,map);
		converCard(player3num,player3,map);
		converCard(leftednum,lefted,map);
		
		
		System.out.println("player1：" + player1);
		System.out.println("player2：" + player2);
		System.out.println("player3：" + player3);
		System.out.println("lefted：" + lefted);
		
	}

	private static void converCard(ArrayList<Integer> player1num,
			ArrayList<String> player1, HashMap<Integer, String> map) {
		// TODO Auto-generated method stub
		for (int i = 0; i < player1num.size(); i++)
		{
			player1.add(map.get(player1num.get(i)));
		}
		
	}

	private static void sortCard(ArrayList<Integer> player1num) {
		// TODO Auto-generated method stub
		Collections.sort(player1num, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		});
	}
	
	

}
