package checkingAndTesting;

import java.util.Arrays;

public class Practice {
	
	public static void main(String[] args)
	{
		int a[]= {5,1,3,4,2};
		int b[]= {8,10,9,7,6};
		Arrays.sort(a);
		Arrays.sort(b);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[i]* b[i];
			System.out.println(sum);
		}
	}
}
