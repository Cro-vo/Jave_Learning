package FunctionalInterface;

import java.util.Arrays;
import java.util.Comparator;

public class demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 函数式接口做返回值
		String[] arr = {"aa", "bbbbbbbb", "ccccc"};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, getComparator());
		System.out.println(Arrays.toString(arr));
		
	}

	public static Comparator<String> getComparator()
	{
//		return new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o2.length() - o1.length();
//			}
//			
//		};
		
		return (o1,o2)->o2.length() - o1.length();

	}
}
