package String_JavaTpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SmallestAndBiggestPalindromeInAString {
	
	public static void main(String[] args)
	{
		String x="aba bacsss abc bac bbb bbbb bbb 111";
		x=x.toLowerCase().trim();
		ArrayList<String> a=new ArrayList<String>();
		String str[]=x.split("\\s+");
		int max=0,min=str.length;
		String maximumPalindrome="",minimumPalindrome="";
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(String s:str )
		{
			String originalString=s;
			char[] ch = s.toCharArray();
			char temp;
			int l=0,u=ch.length-1;
			while(l<=u)
			{
				temp=ch[u];
				ch[l]=ch[u];
				ch[u]=temp;
				l++;
				u--;
			}
			if(originalString.equalsIgnoreCase(String.valueOf(ch)))
			{
				a.add(originalString);
			}
		}
		System.out.println(a);
		for(String s: a)
		{
			m.put(s, s.length());
		}
		
		for(Map.Entry<String, Integer> k: m.entrySet())
		{
			if(k.getValue()>max)
			{
				max=k.getValue();
				maximumPalindrome=k.getKey();
			}
			if(k.getValue()<min)
			{
				min=k.getValue();
				minimumPalindrome=k.getKey();
			}
		}
		System.out.println(maximumPalindrome);
		System.out.println(minimumPalindrome);
		
	}
	

}
