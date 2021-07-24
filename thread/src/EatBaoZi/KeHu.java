package EatBaoZi;

public class KeHu extends Thread {

	private Baozi bz;
	
	
	
	public KeHu(Baozi bz) {
		super();
		this.bz = bz;
	}
	
	


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			synchronized(bz)
			{
				if (bz.flag)
				{
					System.out.println("客户开始吃"+bz.pi+bz.xian+"包子");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					bz.flag = false;
					System.out.println("-------------------------------");
					bz.notify();
				}
				else
				{
					try {
						bz.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
