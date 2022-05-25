package strings;

import java.util.HashMap;
import java.util.Map;

public class SwiggyTest_UniqueCharactersInString {
	
	public static void main(String[] args)
	{
		int s=getUniqueCharacters("statistics");
		System.out.println(s);
	}
	
	public static int getUniqueCharacters(String s)
	{
		char ch[]=s.toCharArray();
		char c1;
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<ch.length;i++)
		{
			if(m.containsKey(ch[i]))
			{
				m.put(ch[i], m.get(ch[i])+1);
			}
			else
			{
				m.put(ch[i], 1);
			}
		}
		int index=0;
		boolean flag=true;
		for(int i=0;i<ch.length;i++)
		{
			if(m.get(ch[i])==1)
			{
				index=i+1;
				break;
			}
		}
		if(index>0)
		{
			return index;
		}
		else
		{
			return -1;
		}
	}
}
