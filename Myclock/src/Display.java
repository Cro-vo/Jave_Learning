
public class Display {

	private int value;
	private int limit;
	
	Display()
	{
		this.value = 0;
		this.limit = 0;
	}
	
	Display(int value,int limit)
	{
		this.value = value;
		this.limit = limit;
	}
	
	public void increase()
	{
		this.value++;
		if (this.value == limit )
		{
			value = 0;
		}
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Display dis = new Display(0,24);
//		while( true )
//		{
//			dis.increase();
//			System.out.println(dis.getValue());
//		}
		
	}

}
