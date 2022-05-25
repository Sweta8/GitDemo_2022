package numbers;

import java.util.Scanner;

public class ArmstrongUptoNo {
	
	public static void main(String[] args)
	{
		int no;
		System.out.println("Enter upto which no");
		Scanner scn=new Scanner(System.in);
		no=scn.nextInt();
		for(int i=1;i<=no;i++)
		{
			if(IsArmstrong(i))
				System.out.println(i);
		}
		
		
	}
	
	public static boolean IsArmstrong(int no)
	{
		int d, n=no,sum=0,digits=0;
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
			return true;
		else
			return false;
	}

}
