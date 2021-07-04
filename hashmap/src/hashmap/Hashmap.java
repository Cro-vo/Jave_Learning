package hashmap;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> coins = new HashMap<Integer,String>();
		coins.put(1, "·Ö");
		coins.put(10,"Ã«");
		coins.put(100,"Ôª");
		
		System.out.println(coins.get(10));
	}

}
