package arrays;

import java.util.HashMap;
import java.util.Map;

public class Practice {
	
	public static void main(String[] args)
	{
		String x="sweta sweta ankita isdoinwell ankita ankita jkli";
		x=x.toLowerCase().replace(" ", "");
		char ch[]=x.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++)
			{
			
			for(int j=0;j<ch.length-1-i;j++)
			{
				if(ch[j]>ch[j+1])
				{
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
			}
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}
	
}