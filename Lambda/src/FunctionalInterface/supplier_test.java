package FunctionalInterface;

import java.util.function.Supplier;

public class supplier_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 例：求数组元素的最大值
		// java.util.function.Supplier<T>
		// 该接口包含抽象方法 T get()
		// 用于获取某一类型的数据
		
		int[] arr = {1,3,5,9,0,-4,8};
		
		int m = getMax(()->{
			int max = arr[0];
			for(int i = 0; i < arr.length; i++)
			{
				if (max < arr[i])
				{
					max = arr[i];
				}
			}
			return max;
		});
		
		System.out.println(m);
		
	}
	
	public static int getMax(Supplier<Integer> sup)
	{
		return sup.get();
	}

}
