package String_JavaTpoint;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {
	
	public static void main(String[] args)
	{
		String x ="sweta sweta ankita isdoinwell ankita ankita jkli";
		String ch[] =x.split(" ");
		Map<String, Integer> m=new HashMap<String ,Integer>();
		
		for(String c: ch)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}
		
		for(Map.Entry<String, Integer> k: m.entrySet())
		{
			if(k.getValue()>1)
			{
				System.out.println(k.getKey()+" : "+k.getValue());
			}
		}
		
	}

}
