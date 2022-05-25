package harness;

import arrays.binarySearch;

public class BinaryArrayCountNoOf1s {
	
	public static void main(String[] args)
	{
		int a[]= {1,1,1,1,1,1,1,1,1,0,0,0,0};
		int c=countOnes(a,a.length);
		System.out.println(c);
		
	}
	
	public static int countOnes(int a[],int n)
	{
		int low=0;
		int high=n-1;
		int mid;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]<1)
			{
				high=mid-1;
			}
			else if(a[mid]>1)
			{
				low=mid+1;
			}
			else
			{
				if(mid==n-1 || a[mid+1]!=1)
				{
					return mid+1;
				}
				else
				{
					low=mid+1;
				}
			}
		}
		return 0;
		
	}

}
