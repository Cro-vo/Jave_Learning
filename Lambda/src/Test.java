import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



// lambda表达式
// 函数式接口，当接口只有一个函数需要实现的时候，可以使用()->{}简化

// 可省略内容：
//   1. (参数列表): 括号中参数列表的数据类型，可以省略不写
//   2. (参数列表)：括号中的参数如果只有一个，那么类型和()都可以省略
//   3. {代码}：如果{}中的代码只有一行，无论是否有返回值，可以一起省略({}、return、;)


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		cookMethod(new Cook() {
//			
//			@Override
//			public void startCook() {
//				// TODO Auto-generated method stub
//				System.out.println("开始煮饭了");
//			}
//			
//		});
		
		
		// 无参方法
//		cookMethod(new Cook() {
//			@Override
//			public void startCook() {
//				// TODO Auto-generated method stub
//				System.out.println("开始煮饭了");
//			}
//		});
		cookMethod(()->{
			System.out.println("开始煮饭了");
		});
		
		
		// 带参方法
		People []arr = {
				new People("yyf1",18),
				new People("yyf2",17),
				new People("yyf3",19)
		};
		
//		Arrays.sort(arr,new Comparator<People>() {
//
//			@Override
//			public int compare(People o1, People o2) {
//				// TODO Auto-generated method stub
//				return o1.getAge() - o2.getAge();
//			}
//		});
		Arrays.sort(arr,(People o1, People o2)->{
			return o1.getAge() - o2.getAge();
		}
	);
		
		for(People p : arr)
		{
			System.out.println(p);
		}
		
	}

	public static void cookMethod(Cook cook)
	{
		cook.startCook();
	}
}
