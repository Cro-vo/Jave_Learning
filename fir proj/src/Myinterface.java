
public class Myinterface implements MyinterfaceA, MyinterfaceB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myinterface inte = new Myinterface();
		inte.method();
		inte.methodA();
		inte.methodB();
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("methodB");
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("methodA");
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		MyinterfaceB.super.method();
	}

}
