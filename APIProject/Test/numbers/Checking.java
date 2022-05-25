package numbers;

import java.util.HashSet;
import java.util.Iterator;

public class Checking {
	
	
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("America");
		hs.add("India");
		hs.add("China");
		hs.add("America");
		hs.add("China");
		
		Iterator<String> itr= hs.iterator();
		while(itr.hasNext())
		{
			String s=(String) itr.next();
			System.out.println(s);
		}
		
		
	}
	
}


