package numbers;

import java.util.Scanner;

public class ArmstrongNo {
	
	public static void main(String[] args)
	{
		int no;
		Scanner scn=new Scanner(System.in);
		no=scn.nextInt();
		int d, n=no,digits=0, sum=0;
		
		while(no>0)    
		{   
		no = no/10;   
		digits++;   
		}   
		no = n;   
		while(no>0)
		{
			d=no%10;
			sum=(int) (sum+Math.pow(d,digits));
			no=no/10;
		}
		if(sum==n)
			System.out.println("Armstrong No");
		else
			System.out.println("Not Armstrong no");
		
	}

}
