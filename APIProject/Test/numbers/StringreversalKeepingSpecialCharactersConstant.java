package numbers;

public class StringreversalKeepingSpecialCharactersConstant {
	
	public static void main(String[] args)
	{
		String x = "mads&w? is***";
		String x1[]=x.split(" ");
		int u,l;
		char ch[];
		char temp;
		String s="";
		for(int i=0;i<x1.length;i++)
		{
			u=x1[i].length()-1;
			l=0;
			ch=x1[i].toCharArray();
			while(l<=u)
			{
				if(!(Character.isDigit(ch[l]) || Character.isAlphabetic(ch[l])))
				{
					l++;
				}
				else if(!(Character.isDigit(ch[u]) || Character.isAlphabetic(ch[u])))
				{
					u--;
				}
				else
				{
				temp=ch[l];
				ch[l]=ch[u];
				ch[u]=temp;
				u--;
				l++;
				}
			}
			s=s+" "+String.valueOf(ch);
			
		}
		
		System.out.println(s.trim());
		
}
}
