
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int [] {1,5,9,3,7};
		SelectSort ss = new SelectSort();
		ss.sort(arr);
		ss.showArray(arr);
	}

	public void sort(int a[])
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			int index = i;
			for (int j = i+1; j < a.length; j++)
			{
				if (a[index] > a[j])
				{
					index = j;
				}
			}
			
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
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
