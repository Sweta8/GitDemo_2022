package revision;

public class Check {
	
	public static void main(String[] args)
	{
		int a[]= {1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,0};
		int low=0;
		int high=a.length-1;
		while(low<high)
		{
			while(a[low]!=1 && low<high)
			{
				low++;
			}
			
			while(a[high]!=0 && low<high)
			{
				high--;
			}
			if(low<high)
			{
				a[low]=0;
				a[high]=1;
				low++;
				high--;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}
