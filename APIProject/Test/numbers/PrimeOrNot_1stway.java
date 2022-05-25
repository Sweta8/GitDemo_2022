package numbers;

import java.util.Scanner;

public class PrimeOrNot_1stway {
	
	public static void main(String[] args)
	{
		int no;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter n0: ");
		no=scn.nextInt();
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
				count++;
		}
		if(count==2)
			System.out.println(no+" is prime");
		else
			System.out.println(no+" is not prime");
	}
	

}
