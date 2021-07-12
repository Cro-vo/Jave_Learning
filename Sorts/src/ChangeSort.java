
public class ChangeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int [] {1,5,9,3,7};
		ChangeSort cs = new ChangeSort();
		cs.sort(arr);
		cs.showArray(arr);
	}

	public void sort(int a[])
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
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
