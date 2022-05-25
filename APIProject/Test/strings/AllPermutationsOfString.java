package strings;

public class AllPermutationsOfString {
	
	public static void main(String[] args)
	{
		permute("abc", 0);
	}
	
	public static void permute(String x, int index)
	{
		if(x.length()==index)
		{
			System.out.println(x);
		}
		else
		{
			for(int i=index;i<x.length();i++)
			{
				x=swap(x, i, index);
				permute(x, index+1);
				x=swap(x, i, index);
			}
		}
	}
	
	public static String swap(String x, int a,int b)
	{
		char ch[]=x.toCharArray();
		char temp;
		temp=ch[a];
		ch[a]=ch[b];
		ch[b]=temp;
		return String.valueOf(ch);
	}

}
