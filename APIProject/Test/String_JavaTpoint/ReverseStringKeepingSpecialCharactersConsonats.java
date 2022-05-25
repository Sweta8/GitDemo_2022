package String_JavaTpoint;

public class ReverseStringKeepingSpecialCharactersConsonats {
	
	public static void main(String[] args)
	{
		
		String x= "sweta is$$$ ssgss?? singhing$$$$";;
		char ch[]=x.toCharArray();
		int u=x.length()-1,l=0;
		char temp;
		while(l<=u)
		{
			
			if(!(Character.isAlphabetic(ch[l])|| Character.isDigit(ch[l])))
			{
					l++;
			}
			else if(!(Character.isAlphabetic(ch[u])|| Character.isDigit(ch[u])))
			{
					u--;
			}
			else
			{
				temp=ch[l];
				ch[l]=ch[u];
				ch[u]=temp;
				l++;
				u--;
			}
			
		}
		System.out.println(String.valueOf(ch));

}
}
