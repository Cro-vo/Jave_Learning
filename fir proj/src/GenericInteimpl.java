
public class GenericInteimpl<I> implements GenericInte<I> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericInteimpl gci = new GenericInteimpl();
		gci.method("hello world! ");
	}

	@Override
	public void method(I i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}

}
