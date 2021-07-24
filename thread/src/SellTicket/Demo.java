package SellTicket;

// 解决线程安全问题
// 	1. 使用同步代码块
//  2. 使用同步方法
//  3. 使用同步锁

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable run = new RunnableImpl();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
