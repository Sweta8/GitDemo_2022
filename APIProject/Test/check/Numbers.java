package check;

public class Numbers {
	
	public static void main(String[] args)
	{
		
	
	int a=999;
	int d,sum=0;
	while(a>0 || sum>9)
	{
		if(a==0)
		{
			a=sum;
			sum=0;
		}
		d=a%10;
		sum=sum+d;
		a=a/10;
		
	}
	
	System.out.println(sum);

}

}