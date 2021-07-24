package SellTicket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {

	private int ticket = 100;
	
	Object obj = new Object(); // 创建锁对象
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		while(true)
//		{
//			synchronized (obj) {			// 使用同步代码块解决线程安全问题
//				if (ticket > 0)
//				{
////					try {
////						Thread.sleep(10);
////					} catch (InterruptedException e) {
////						// TODO Auto-generated catch block
////						e.printStackTrace();
////					}
//					System.out.println(Thread.currentThread().getName()
//							+"正在卖第"+ ticket +"张票");
//					ticket--;
//				}
//				else 
//				{
//					break;
//				}
//			}
//		}
		
		
		// 同步方法
//		payTicket();
		
	
	// 使用同步锁解决线程安全问题
	while(true)
		{
			Lock l = new ReentrantLock();
			l.lock();
			if (ticket > 0)
			{
				System.out.println(Thread.currentThread().getName()
						+"正在卖第"+ ticket +"张票");
				ticket--;
			}
			else 
			{
				break;
			}
			l.unlock();
		}
	}
	
	// 使用同步方法解决线程安全问题
	public synchronized void payTicket()
	{
		while(true)
		{		
			if (ticket > 0)
			{
				System.out.println(Thread.currentThread().getName()
						+"正在卖第"+ ticket +"张票");
				ticket--;
			}
			else 
			{
				break;
			}
		}
	}

}
