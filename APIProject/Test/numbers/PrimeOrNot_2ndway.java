package numbers;

import java.util.Scanner;

public class PrimeOrNot_2ndway {
	
	public static void main(String[] args)
	{
		int no;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter n0: ");
		no=scn.nextInt();
		int count=0;
		if(no==0 || no==1)
		{
			System.out.println("Not prime");
			return;
		}
			
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
				count=1;
			break;
		}
		if(count==0)
			System.out.println(no+" is prime");
		else
			System.out.println(no+" is not prime");
	}

}
