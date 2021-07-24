package SellBaoZi;

public class Sellbaozi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个锁对象
		Object obj = new Object();
		
		// 创建顾客线程
		new Thread()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized(obj) {
					System.out.println("顾客：点了个包子");
					try {
						obj.wait();	// 等待做包子
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("顾客：开吃！");
				}
			}
			
		}.start();
		
		// 创建店主线程
		new Thread()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized(obj)
				{
					System.out.println("-------------------");
					System.out.println("店主：正在做包子，请等待5秒");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("店主：包子做好了");
					System.out.println("-------------------");
					obj.notify();	// 通知顾客包子做好了
					
					
				}
			}
			
		}.start();
		
		
	}

}
