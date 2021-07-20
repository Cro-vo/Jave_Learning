package laptopdemo;

public class laptop {

	public void powerOn()
	{
		System.out.println("电脑开机");
	}
	
	public void powerOff()
	{
		System.out.println("电脑关机");
	}
	
	public void useDevice(USB usb)
	{
		usb.on();
		usb.off();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop lap = new laptop();
		lap.powerOn();
		
		lap.useDevice(new Mouse());
		
		lap.useDevice(new Keyboard());
		
		lap.powerOff();
		
	}

}
