package reflect;

public class Person {
	private String name;
	private int age;
	
	public String a;
	protected String b;
	String c;
	private String d;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	public void sleep()
	{
		System.out.println("sleeping...");
	}
	
	public void eat(String food)
	{
		System.out.println("eating " + food);
	}

	
	
	
	
}
