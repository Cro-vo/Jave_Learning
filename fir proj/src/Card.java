import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Card {

	public static ArrayList<String> getCard()
	{
		ArrayList<String> list = new ArrayList<>();
		String[] a = {"♦", "♥", "♣", "♠"};

		String[] b = {"2", "A", "3", "4",
				"5", "6", "7", "8",
				"9", "10", "J", "Q", "K"};

		for (int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				String temp;
				temp = a[i]+b[j];
				list.add(temp);
			}
			
		}
		
		list.add("大王");
		list.add("小王");
		
		Collections.shuffle(list);
		
		return list;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> card = getCard();
//		System.out.println(card.size());

		ArrayList<String> farmer1 = new ArrayList<>();
		ArrayList<String> farmer2 = new ArrayList<>();
		ArrayList<String> landlord = new ArrayList<>();
		
		int i = 0;
		while (i<=50)
		{
			if (i%3 == 0)
			{
				farmer1.add(card.get(i));
			}
			else if (i%3 == 1)
			{
				farmer2.add(card.get(i));
			}
			else if (i%3 == 2)
			{
				landlord.add(card.get(i));
			}
			i++;
		}
		
		while(i != 54)
		{
			landlord.add(card.get(i));
			i++;
		}
		
		System.out.println("farmer1:");
		System.out.println(farmer1.size() + " " + farmer1);
		System.out.println("farmer2:");
		System.out.println(farmer2.size() + " " + farmer2);
		System.out.println("landlord:");
		System.out.println(landlord.size() + " " + landlord);
	}

}
