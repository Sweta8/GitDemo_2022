
//Java Program to replace lower-case characters with upper-case and vice-versa

package String_JavaTpoint;

public class ReplaceLowerCaseCharactersWithUperCaseAndViceversa {
	
	public static void main(String[] args)
	{
		String s="swetaAAA isssA klliMMKsMM";
		String x="";
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(Character.isUpperCase(ch))
				x=x+ Character.toLowerCase(ch);
			else
				x=x+Character.toUpperCase(ch);	
		}
		System.out.println(x);
	}

}
