package arrays;

public class binarySearch {
	
	
	public static void search(int a[], int first,int last,int value)
	{
		int mid;
		while(first<=last)
		{
			mid=(first+last)/2;
			if(a[mid]<value)
			{
				first=mid+1;
			}
			else if(a[mid]==value)
			{
				System.out.println(value+" is found at position "+mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			
		}
		
		if(first>last)
		{
			System.out.println("Element No Found");
		}
		
	}
	
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};  
        int key = 90;  
        int last=arr.length-1;  
        search(arr,0,last,key);   
	}

}
