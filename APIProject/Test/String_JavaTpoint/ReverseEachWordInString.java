package String_JavaTpoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseEachWordInString {
	
	public static void main(String[] args)
	{
		String x ="sweta is not trying harsd to crack the exam";
		String ch[]= x.split(" ");
		String y="";
		int l=0,u;
		char temp;
		for(String c: ch)
		{
			char str[] = c.toCharArray();
			l=0;
			u=str.length-1;
			while(l<=u)
			{
				temp=str[l];
				str[l]=str[u];
				str[u]=temp;
				l++;
				u--;
			}
			y=y+" "+String.valueOf(str);
		}
		
		System.out.println(y.trim());
		
	}

}
