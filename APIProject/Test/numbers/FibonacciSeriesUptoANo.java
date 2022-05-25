package numbers;

import java.util.Scanner;

public class FibonacciSeriesUptoANo {
	
	public static void main(String[] args)
	{
		int a=0,b=1,c;
		System.out.println("Enter no upto which fibonacci series is to be printed: ");
		Scanner scn =new Scanner(System.in);
		int no=scn.nextInt();
		System.out.print(a+" "+b);
		while((a+b)<=no)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
