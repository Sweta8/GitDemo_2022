package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromStringUsingHashSetAndSortedInAscendingOrder {
	
	public static void main(String[] args)
	{
		String newString="";
		String m ="sweta sweta ananya";
		String arr[]=m.split(" ");
		List<String> a = Arrays.asList(arr);
		Set<String> s= new TreeSet<>(a);
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			newString=newString+" "+it.next();
		}
		System.out.println(newString.trim());
		
	}

}
