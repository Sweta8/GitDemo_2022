
//Java Program to find maximum and minimum occurring character in a strings using for loop
package String_JavaTpoint;

public class MaximumAndMiniumOccuringCharacterInStringUsingForLoop {
	
	public static void main(String[] args)
	{
		String x="swetassddd is singinddddgwm";
		x=x.replaceAll(" ", "");
		char ch[] = x.toCharArray();
		int count=1,max=0,min=x.length();
		char maxCharacter=x.charAt(0),minCharcater=x.charAt(0);
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if((ch[i]==ch[j])&& (ch[i]!=' ')&&(ch[i]!='\0'))
				{
					count++;
				ch[j]='\0';
				}
			}
			if(ch[i]!='\0')
			{
			if(count>max)
			{
				maxCharacter=ch[i];
				max=count;
			}
			else if(count<min)
			{
				minCharcater=ch[i];
				min=count;
			}
			}
			count=0;
		}
		System.out.println(maxCharacter);
		System.out.println(minCharcater);
	}
	

}
