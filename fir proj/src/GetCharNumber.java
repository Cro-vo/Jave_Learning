
import java.util.*;

public class GetCharNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (map.containsKey(c))
			{
				int value = map.get(c);
				value++;
				map.put(c, value);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		in.close();
	}

}
