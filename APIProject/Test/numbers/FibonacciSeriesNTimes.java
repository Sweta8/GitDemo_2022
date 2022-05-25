package numbers;

import java.util.Scanner;

public class FibonacciSeriesNTimes {
	
	public static void main(String[] args)
	{
		System.out.print("Enter the limit:"+" ");
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		int a=0, b=1,c;
		System.out.print(a+" "+b);
		for(int i=1;i<=no-2;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	

}
