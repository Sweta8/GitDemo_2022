package strings;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateNumbersAndSortInAscendingOrder {
	
	public static void main(String[] args)
	{
		int arr[] = {1,3,6,7,8,9,0,0,0};
		TreeSet<Integer> l =new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			l.add(arr[i]);
		}
		System.out.println(l);
		
	}

}
