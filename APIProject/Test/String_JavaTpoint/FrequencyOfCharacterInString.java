package String_JavaTpoint;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacterInString {
	
	public static void main(String[] args)
	{
		String x="sweta is singhdhhd ahhdhdd???";
		x=x.replace(" ", "");
		Map<Character, Integer> m=new HashMap<Character,Integer>();
		char ch[] = x.toCharArray();
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
