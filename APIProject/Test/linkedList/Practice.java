package linkedList;

public class Practice {
	
	public static void main(String[] args)
	{
		int a[]= {1,1,1,1,1,1,1,0,0};
		int val=countNoOfNodes(a, a.length);
		System.out.println(val);
	}
	
	public static int countNoOfNodes(int a[],int n)
	{
		int low=0;
		int high=a.length-1;
		int mid;
		while(low<high)
		{
			mid=(low+high)/2;
			if(a[low]>1)
			{
				low=mid+1;
			}
			else if(a[low]<1)
			{
				high=mid-1;
			}
			else
			{
				if(mid==n-1 || a[mid+1]!=1 )
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
