package thread;

public class MyThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 10; i++)
		{
//			try {
//				Thread.sleep(750);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("run:" + i);
			
		}
//		System.out.println(Thread.currentThread().getName());
		
	}

}
