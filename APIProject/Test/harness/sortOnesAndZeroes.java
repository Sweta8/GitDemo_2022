package harness;

public class sortOnesAndZeroes {
	
	public static void main(String[] args)
	{
		int a[]= {1,0,0,1,0,0,0,1};
		int low=0;
		int high=a.length-1;
		
		while(low<high)
		{
			while(a[low]==0 && low<high)
				low++;
			while(a[high]==1 && low<high)
				high--;
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
