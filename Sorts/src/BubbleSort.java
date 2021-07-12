
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int [] {1,5,9,3,7};
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
		bs.showArray(arr);
	}
	
	public void sort(int a[])
	{
		//外层 循环执行len-1次
		for (int i = 0; i<a.length - 1; i++)
		{
			//内层 两个数据之间对比，并且对比次数逐渐减少
			for (int j = 0; j<a.length - 1 - i; j++)
			{
				if (a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public void showArray(int a[])
	{
		for (int x : a)
		{
			System.out.print(x + " ");
		}
	}

}
