import java.util.*;

public class array {

	public static void f(int a, int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("A = "+ a + ",B = " + b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//函数的传递为值传递
		int a = 5;
		int b = 10;
		System.out.println("a = "+ a + ",b = " + b);
		f(a, b);
		System.out.println("a = "+ a + ",b = " + b);
		
		//foreach取出的是数据的副本
		int[] c = {1,2,3};
		for(int i : c)
		{
			i=0;
		}
		
		//一维数组的输出
		for(int i : c)
		{
			System.out.print(i);
		}
		System.out.println();
		
		//二维数组的输出
		int arr[][] = new int[][] {{1,2},{3,4,5,6}};
		for (int x[] : arr)
		{
			for (int y : x)
			{
				System.out.print(y);
			}
			System.out.println();
		}
		
		//填充数组
		Arrays.fill(c, 6);
		
		//数组排序
		Arrays.sort(c);
		
		//数组复制
		int d[] = Arrays.copyOf(c, 10);
		for(int x : d)
		{
			System.out.print(x);
		}
		System.out.println();
		
		//数组查找
		int e[] = new int [] {1,2,5,9,7,3};
		Arrays.sort(e);
		for(int x : e)
		{
			System.out.print(x);
		}
		System.out.println();
		int index = Arrays.binarySearch(e, 8);
		System.out.println(index);
		

	}

}
