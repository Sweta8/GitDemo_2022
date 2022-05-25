package numbers;

import java.util.Scanner;

public class PrimeNumbersBetween2Nos {
	
	public static void main(String[] args)
	{
		int a,b;
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter value of a and b :");
		a=scn.nextInt();
		b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(isPrime(i))
				System.out.println(i);
		}
		
	}
	
	public static boolean isPrime(int a)
	{

		if(a==0 || a==1)
		{
			return false;
		}
		else
			for(int i=2;i<=a/2;i++)
			{
				if(a%i==0)
				{
					return false;
					
				}
			}
		
		return true;
	}

}
