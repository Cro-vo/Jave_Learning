package EatBaoZi;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Baozi bz = new Baozi();
		new BaoZiPu(bz).start();
		new KeHu(bz).start();
		
	}

}
