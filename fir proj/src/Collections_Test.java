import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections_Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Person> list1 = new ArrayList<>();
			
		// Collections静态方法
		
		// 批量添加元素
		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);
		Collections.addAll(list1, new Person("张三",18),
				new Person("李四",17), new Person("王五",25));
		System.out.println(list);
		
		// 打乱顺序
		Collections.shuffle(list);
		System.out.println(list);
		
		// 排序（基本数据类型）------默认升序
		Collections.sort(list);
		System.out.println(list);
		
		// 排序(自定义类型),需要list中的元素实现Comparable接口来定义排序规则
		Collections.sort(list1);
		System.out.println(list1);
		
		// 排序-comparetor 可创建匿名内部类
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
			
		});
		System.out.println(list);
		
		Collections.sort(list1, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o2.age-o1.age;
			}
			
		});
		System.out.println(list1);
		
	}

}

class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		return (this.age - o.age);// 升序
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}