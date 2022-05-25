package check;

public class LasrgestAndSmallestNo {
	
	public static void main(String[] args)
	{
	
		int a[]= {15, 18, 2, 3, 6, 12};
		System.out.println(countRotations(a,0, a.length-1));
		
	}
	
	public static int countRotations(int a[],int low,int high)
	{
		if(high<low)
		{
			return 0;
		}
		if(low==high)
		{
			return 0;
		}
		
		int mid=(low+high)/2;
		
		if(high>mid && a[mid+1]<a[mid])
		{
			return mid+1;
		}
		if(low<mid && a[mid]<a[mid-1])
		{
			return mid;
		}
		if(a[high]>a[low])
		{
			return countRotations(a, low, mid-1);
		}
		else
		{
			return countRotations(a, mid+1, high);
		} 
	}
	
}
