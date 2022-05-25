package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromNumberUsingMap {
	
	public static void main(String[] args)
	{
		int arr[]= {0,2,4,1,3,6,0};
		Map<Integer, Boolean> m=new HashMap<Integer, Boolean>();
		for(int i=0;i< arr.length;i++)
		{
			if(m.get(arr[i])==null)
					{
				System.out.print(arr[i]+" ");
					}
			m.put(arr[i], true);
		}
		Set<Integer> keySet= new TreeSet<Integer>(m.keySet());
		System.out.println("\n"+"Elements in Asending Sorted Order");
		System.out.println(keySet);
		
		List<Integer> l=new ArrayList<Integer>(keySet);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Elements in reverse Order");
		System.out.println(l);
		
		
	}

}
