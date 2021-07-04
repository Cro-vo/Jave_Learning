
public class Clock {

	private Display hour;
	private Display minute;
	private Display second;
	
	Clock(int h, int m, int s)
	{
		hour = new Display(h,24);
		minute = new Display(m,60);	 
		second = new Display(s,60);
	}
	
	public void tick()
	{
		second.increase();
		if (second.getValue() == 0)
		{
			minute.increase();
		}
		if (minute.getValue() == 0)
		{
			hour.increase();
		}
		System.out.printf("%02d:%02d:%02d\n",
							hour.getValue(),
							minute.getValue(),
							second.getValue());
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock(9,56,10);
		
		while(true)
		{
			c.tick();	
		}
	}

}
