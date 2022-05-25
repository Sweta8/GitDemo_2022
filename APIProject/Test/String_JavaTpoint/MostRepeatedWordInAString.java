package String_JavaTpoint;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWordInAString {
	
	public static void main(String[] args)
	{
		String x="sweta is singhing and sweta is    dancing too";
		x=x.toLowerCase().trim();
		String str[] = x.split("\\s+");
		int max=0;
		String maximumWords="";
		Map<String, Integer> m = new HashMap<String,Integer>();
		for(String s: str)
		{
			if(m.containsKey(s))
			{
				m.put(s, m.get(s)+1);
			}
			else
			{
				m.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> k: m.entrySet())
		{
			if(k.getValue()>max)
			{
				max=k.getValue();
				maximumWords=k.getKey();
			}
		}
		
		System.out.println("Maximu words is "+ maximumWords);
		
	}

}
