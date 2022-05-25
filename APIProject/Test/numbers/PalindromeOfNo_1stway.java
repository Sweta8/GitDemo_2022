package numbers;

import java.util.Scanner;

public class PalindromeOfNo_1stway {
	
	public static void main(String[] args)
	{
		int no;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter No: ");
		no=scn.nextInt();
		int n,d,sum=0;
		n=no;
		while(no>0)
		{
			d=no%10;
			sum=(sum*10)+d;
			no=no/10;
		}
		
		if(sum==n)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}

}
