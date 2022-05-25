package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestPlaindromeInAString {
	
	
	public static void main(String[] args)
	{
		String x= "forgeeksskeegfor";
		String sub="",x1="",reversedString="",longestPalindrome="";
		char ch[],temp;
		int l,u;
		Map<String,Integer> m=new HashMap<>();
		int max=0;
		for(int i=0;i<x.length();i++)
		{
			for(int j=i+1;j<x.length()+1;j++)
			{
				sub=x.substring(i,j); 
				x1=sub;
				ch=x1.toCharArray();
				l=0;
				u=ch.length-1;
				while(l<=u)
				{
					temp=ch[l];
					ch[l]=ch[u];
					ch[u]=temp;
					l++;
					u--;
				}
				reversedString=String.valueOf(ch);
				if(sub.equalsIgnoreCase(reversedString))
				{
					m.put(sub, sub.length());
				}
			}
			
		}
		
		for(Map.Entry<String, Integer> k: m.entrySet())
		{
			if(k.getValue()>max)
			{
				max=k.getValue();
				longestPalindrome=k.getKey();
		}
	}
		System.out.println("Longest Plaindrome is "+longestPalindrome);

}
}
