package String_JavaTpoint;

import java.util.HashMap;
import java.util.Map;

public class LargestAndSmallestWordInString {
	
	public static void main(String[] args)
	{
	int max=0;
	String longestString="";
	String x="sweta is kinngfif";
	Map<String, Integer> m=new HashMap<String, Integer>();
	String ch[]=x.split(" ");
	for(String c: ch)
	{
		m.put(c, c.length());
	}
	
	for(Map.Entry<String, Integer> k: m.entrySet())
	{
		if(k.getValue()>max)
		{
			longestString=k.getKey();
			max=k.getValue();
		}
	}
	System.out.println("Longest Word In String is"+ longestString);

}
}
