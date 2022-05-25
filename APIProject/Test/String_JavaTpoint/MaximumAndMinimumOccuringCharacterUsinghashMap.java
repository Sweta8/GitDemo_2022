package String_JavaTpoint;

import java.util.HashMap;
import java.util.Map;

public class MaximumAndMinimumOccuringCharacterUsinghashMap {
	
	public static void main(String[] args) {
		
		String x="sweta singh is not singnnning";
		x=x.replace(" ","");
		char ch[] =x.toCharArray();
		int max=1,min=ch.length;
		char maxCharacter=ch[0], minCharacter=ch[0];
		Map<Character,Integer> m=new HashMap<Character, Integer>();
		
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
			if(max<k.getValue())
			{
				max=k.getValue();
				maxCharacter=k.getKey();
			}
			else if(min>k.getValue())
			{
				min=k.getValue();
				minCharacter=k.getKey();
			}
		}
		System.out.println(maxCharacter);
		System.out.println(minCharacter);
	}

}
