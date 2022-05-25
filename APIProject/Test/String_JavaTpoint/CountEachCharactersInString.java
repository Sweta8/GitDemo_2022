
// Count No of Characters of each character using HashMap
package String_JavaTpoint;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharactersInString {
	
	public static void main(String[] args)
	{
		
		String x="sweta singh si sbsssss dhjdjd";
		x=x.replace(" ", "");
		Map<Character, Integer> m=new HashMap<Character,Integer>();
		char ch[]=x.toCharArray();
		for(char c: ch)
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
		
		for(Map.Entry<Character, Integer> k: m.entrySet())
		{
			System.out.println(k.getKey()+" "+k.getValue());
		}
		
	}

}
