package strings;

public class Swiggy_2ndQuestion {
	
	public static void main(String[] args)
	{
		boolean flag;
		int a[]= {3,4,2,12,3,1};
		int max=0;
		int count=0;
		int j;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			max=0;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
					a[i]=max;
					count++;
				}	
			}
			if(count==0)
				a[i]=max;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
