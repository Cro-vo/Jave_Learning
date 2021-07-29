package objStream;

import java.io.Serializable;

public class person implements Serializable {

	private static final long serialVersionUID = 45L; // 添加该属性时在反序列化时若修改了类 不会报错
	private String name;
	private int age;// transient关键字和static关键字修饰的变量不能被序列化
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	
	
}
