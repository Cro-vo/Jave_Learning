
public interface MyinterfaceB {
	public abstract void methodB();
	public default void method()
	{
		System.out.println("default methodB");
	}
}
