
//Java Program to determine whether two strings are the anagram

package String_JavaTpoint;

public class TwoStringAnagramOrNot {
	
	public static void main(String[] args)
	{
		String x="abc abcys abccc";
		String x1=x;
		String y="";
		int u=x1.length()-1;
		int l=0;
		char temp;
		char ch[]=x.toCharArray();
		while(l<=u)
		{
			temp=ch[l];
			ch[l]=ch[u];
			ch[u]=temp;
			l++;
			u--;
			
		}
		y=String.valueOf(ch);
		System.out.println(y);
	}

}

//Note: using while loop time complexity will be nlogn