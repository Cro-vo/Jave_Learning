
public class PacketClass {
	public static void main(String[] args) {
		
		String str[] = new String [] {"12","23","34"};
		int sum = 0;
		for (int i = 0; i < str.length; i++)
		{
			sum += Integer.parseInt(str[i]);
		}
		System.out.println(sum);
		System.out.println(Integer.TYPE);
		
		Boolean bool = new Boolean("TRue");
		System.out.println(bool);
		
		Double speed = new Double("12.5");
		String s = speed.toString();
		for (int i = 0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}
}
