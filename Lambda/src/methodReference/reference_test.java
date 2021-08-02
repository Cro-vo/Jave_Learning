package methodReference;


public class reference_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Hello world!";
		
		// 使用lambda表达式为：
		printString(string,(s)->{
			System.out.println(s);
		});
		
		// 使用方法引用为:(直接调用System.out对象的println方法，取代lambda的间接调用)
		// 对象（System.out）和函数（println）都必须已经存在
		printString(string,System.out::println);
		
	}
	
	// 定义函数
	public static void printString(String str,Printable p)
	{
		p.p(str);
	}
	
	// 定义接口
	public interface Printable
	{
		public abstract void p(String s);
	}

}
