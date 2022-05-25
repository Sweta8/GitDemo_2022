//Reverse string without special characters

package programmingInterviewQuestions;

public class ReverseStringWithoutSpecialCharacters {
	
	public static void main(String[] args)
	{
		String x="sweta is$$$ ssgss?? singhing$$$$";
		String str="";
		x=x.trim();
		char ch;
		for(int i=x.length()-1;i>=0;i--)
		{
			ch=x.charAt(i);
			if((Character.isDigit(ch)|| Character.isAlphabetic(ch) || Character.isSpace(ch)))
			{
				str=str+ch;
			}
		}
		System.out.println(str);
	}
	
	

}
