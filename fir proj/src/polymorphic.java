// 子类需要将抽象类中的 抽象方法 覆盖
public class polymorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal ani;
//		animal ani = new animal("andy",18);
//		ani.call();
		ani = new dog("daive",19);
		ani.call();
		ani.show();
		ani = new cat("jim",20);
		ani.call();
		ani.show();

	}

}

abstract class animal
{
	protected String name;
	protected int age;
	animal()
	{
		this.name = null;
		this.age = 0;			
	}
	animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public abstract void call();
	public void show()
	{
		System.out.println(name + " " + age);
	}
}

class dog extends animal
{
	dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void call()
	{
		System.out.println("这是狗," + name + " " + age);
	}
}

class cat extends animal
{
	cat(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void call()
	{
		System.out.println("这是猫," + name + " " + age);
	}
}

