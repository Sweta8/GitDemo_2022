package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayAndSortInDescendingOrder {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,6,0,3,4,9,9,0};
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			s.add(arr[i]);
		}
		ArrayList<Integer> al=new ArrayList<>(s);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}

}
