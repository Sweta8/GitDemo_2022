package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromStringAndSortInDescendingOrder {
	
	public static void main(String[] args)
	{
		String newString="";
		String x ="sweta is sweta ananya aa";
		String arr[] = x.split(" ");
		List<String> al=Arrays.asList(arr);
		Collections.sort(al, Collections.reverseOrder()); // sorting in reverseOrder i.e descending
		System.out.println(al);
		Set<String> s = new LinkedHashSet<String>(al); //hashset is used to maintain insertion order
		Iterator<String> it= s.iterator();
		while(it.hasNext())
		{
			newString =newString+" "+it.next();
		}
		System.out.println(newString.toString());
	}

}
