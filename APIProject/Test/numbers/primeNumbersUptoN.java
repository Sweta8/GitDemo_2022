package numbers;

import java.util.Scanner;

public class primeNumbersUptoN {
	
	public static void main(String[] args)
	{
		int value=1;
		 while(value<=11)
		 {
			 int count=0;
			for(int i=1;i<=value;i++)
			{
				if(value %i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(value+" ");
			}
			value++;
		 }
	}
	
	

}
