package FunctionalInterface;

public class demo01 {

	// Lambda表达式的特点：延迟执行
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mes1 = "Hello";
		String mes2 = "World";
		String mes3 = "Java";
		
		showLog(1, ()->{
			return mes1+mes2+mes3;// 可以直接调用main函数中的数据
		});

	}
	
	public static void showLog(int level, BuilderMessage bm)
	{
		if (level == 1)
		{
			System.out.println("不满足条件不执行字符串拼接");
			System.out.println(bm.show());;
		}
	}

}
