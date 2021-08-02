package thread;

// 多线程启动：
// 	创建Thread的子类，并且重写run()方法，
// 	在调用start()时会同时进行main线程和run线程

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 方法一创建多线程（通过继承 Thread 类本身,子类重写run方法）
		MyThread mt = new MyThread();
//		mt.start();
		
		// 匿名内部类简化写法
		new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("子类重写run()方法");
			}
			
		}.start();
		
		
		
//		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 10; i++)
		{
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("main" + i);
		}
		
		
		// 方法二创建多线程(使用Runnable的接口实现类对象)
		Thread t = new Thread(new Runnableimpl());
		t.start();
		
		
		// 匿名内部类简化写法
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("接口实现run()方法");
			}
		}).start();

	}

}
