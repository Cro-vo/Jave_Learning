package FunctionalInterface;

public class Simplify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 使用匿名内部类
		startThread(new Runnable() {	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName() + "正在启动");
			}
		});
		
		// 使用Lambda表达式
		startThread(()->{
			System.out.println(Thread.currentThread().getName() + "正在启动");
		});
		
		// 进一步简化Lambda表达式
		startThread(()->System.out.println(Thread.currentThread().getName() + "正在启动"));
		
	}
	
	public static void startThread(Runnable run)
	{
		new Thread(run).start();
	}

}
