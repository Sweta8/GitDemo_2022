package strings;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args)
	{
		int arr[] = {1,3,6,7,8,9,0,0,0};
		LinkedHashSet<Integer> l =new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			l.add(arr[i]);
		}
		System.out.println(l);
		
	}

}
