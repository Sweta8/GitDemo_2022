package arrays;

import java.util.Map;
import java.util.TreeMap;

public class MissingElementsInArray {
	
	public static void main(String[] args)
	{
	
	int a[] = {1,3,4,9,15,16};
	Map<Integer,Boolean> m=new TreeMap<Integer,Boolean>();
	for(int i=0;i<a.length;i++)
	{
		m.put(a[i], false);
	}
	
	for(int i=1;i<=100;i++)
	{
		if(!m.containsKey(i))
		{
			m.put(i, true);
		}
	}
	
	for(Map.Entry<Integer, Boolean> k: m.entrySet())
	{
		if(k.getValue().equals(true))
		{
			System.out.print(k.getKey()+" ");
		}
	}
	
	
	
	
	}
	

}
