
public interface MyinterfaceA {
	public abstract void methodA();
	public default void method()
	{
		System.out.println("default methodA");
	}
}
