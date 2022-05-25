package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FunWithAnagrams_2ndQuestion {
	
public static void main(String[] args) {
	
	String x[]= {"code","doce","ecod","framer","frame"};
	List<String> k=Result.funWithAnagram(Arrays.asList(x));
	System.out.println(k);
}
	
}

class Result
{
	public static List<String> funWithAnagram(List<String> text)
	{
		String x[]= text.toArray(new String[text.size()]);
		char ch[],ch1[];
		Map<String,Boolean> hm=new TreeMap<>();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<x.length;i++)
		{
			ch=x[i].toCharArray();
			Arrays.sort(ch);
			for(int j=i+1;j<x.length;j++)
			{
				ch1=x[j].toCharArray();
				Arrays.sort(ch1);
				if(String.valueOf(ch).equalsIgnoreCase(String.valueOf(ch1)) && (ch.length==ch1.length))
				{
					hm.put(x[i], true);
					x[j]="";
				}
				else if(!(String.valueOf(ch).equalsIgnoreCase(String.valueOf(ch1))))
				{
					hm.put(x[i], true);
					hm.put(x[j], true);
				}
			}
		}
		
		for(Map.Entry<String, Boolean> k: hm.entrySet())
		{
			if(k.getValue()==true && k.getKey()!="")
			{
				al.add(k.getKey());
			}
		}
		return al;
	}
}
