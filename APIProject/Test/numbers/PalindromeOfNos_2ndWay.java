package numbers;

import java.util.Scanner;

public class PalindromeOfNos_2ndWay {
	

	public static void main(String[] args)
	{
		int no;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter No: ");
		no=scn.nextInt();
		String str=String.valueOf(no);
		String str1=str, reverseString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseString=reverseString+str.charAt(i);
		}
		
		if(str1.equalsIgnoreCase(reverseString))
			System.out.println("Plaindrome");
		else
			System.out.println("Not Palindrome");
	}


}
