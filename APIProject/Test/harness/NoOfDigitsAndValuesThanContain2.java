package harness;

public class NoOfDigitsAndValuesThanContain2 {
	
	public static void main(String[] args)
	{
		int no=22;
		int n;
		int digit=0;
		for(int i=1;i<=no;i++)
		{
			n=i;
			while(n>0)
			{
				if(n%10==2)
				{
					System.out.println(n);
					digit++;
				}
				n=n/10;
			}
		}
		
		System.out.println(digit);
	}

}
