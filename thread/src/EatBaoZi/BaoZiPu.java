package EatBaoZi;

public class BaoZiPu extends Thread {

	private Baozi bz;
	private int num = 1;
	
	public BaoZiPu(Baozi bz) {
		super();
		this.bz = bz;
	}

	/**
	 * @return the bz
	 */
	public Baozi getBz() {
		return bz;
	}


	/**
	 * @param bz the bz to set
	 */
	public void setBz(Baozi bz) {
		this.bz = bz;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			synchronized(bz)
			{
				if (!bz.flag)
				{
					System.out.println("店铺准备生产包子......");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if (num % 2 == 0)
					{
						bz.pi = "薄皮";
						bz.xian = "虾仁馅";
					}
					if (num % 2 == 1)
					{
						bz.pi = "玉米皮";
						bz.xian = "牛肉馅";
					}
					num++;
					bz.flag = true;
					System.out.println("做好了"+bz.pi + bz.xian+"的包子");
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
