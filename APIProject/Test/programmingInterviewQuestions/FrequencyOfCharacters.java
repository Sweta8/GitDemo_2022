package programmingInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
	
	public static void main(String[] args)
	{
		String a="sweta is dancing and acting";
		a=a.replaceAll("\\s+", "").trim();
		char ch[]=a.toCharArray();
		Map<Character, Integer> m=new HashMap<Character,Integer>();
		for(char c: ch)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c));
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
