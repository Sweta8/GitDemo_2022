package check;

public class SubArraySumIs0 {
	
	public static void main(String[] args)
	{
		int[] a={1,2,-3};
		int sum;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			sum=sum+a[i];
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum ==0)
				{
					System.out.println("true");
				}
			}
		}
		
	}

}
