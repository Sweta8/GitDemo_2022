
//Java Program to count the total number of vowels and consonants in a strings
package String_JavaTpoint;

public class TotalNoOfVowelsAndConsonants {
	
	public static void main(String[] args)
	{
		String x= "sweta?? is00 dancing";
		String y=x.replace(" ", "");
		int initialCount=y.length();
		char ch;
		int noOfLetters=0, noOfDigits=0,noOfSpecialCharacters=0,noOfvowels=0;
		for(int i=0;i<y.length();i++)
		{
			ch=y.charAt(i);
			if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z'))
			{
				noOfLetters++;
				if(((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z'))&&(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
				{
					noOfvowels++;
				}}
			
				else if(ch>='0'&& ch<='9')
				noOfDigits++;
			else
				noOfSpecialCharacters++;
		}
		System.out.println("No Of Letters "+noOfLetters);
		System.out.println("No of Digits "+ noOfDigits);
		System.out.println("No of special characters "+ noOfSpecialCharacters);
		System.out.println("No of vowels is "+noOfvowels);
		System.out.println("No of consonants is "+ (noOfLetters-noOfvowels));
	}//

}
