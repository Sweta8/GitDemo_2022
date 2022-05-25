package sorting;

public class QuickSort {
	
	public  static void main(String[] args)
	{
		int a[]= {10,30,1,0,3,4,2,1};
		QuickSort k=new QuickSort();
		k.quicksort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
	
	
	public void  quicksort(int a[], int low,int high)
	{
		int partitionIndex;
		if(low<high)
		{
			partitionIndex=partition(a, low, high);
			quicksort(a, low, partitionIndex-1);
			quicksort(a, partitionIndex+1, high);
		}
	}
	
	public  int partition(int a[],int low,int high)
	{
		int pivot=a[low];
		int i=low+1;
		int j=high;
		int temp;
		do
		{
		while(a[i]<=pivot)
		{
			i++;
		}
		
		while(a[j]>pivot)
		{
			j--;
		}
		
		if(i<j)
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		
		}while(i<j);
		
		temp=a[low];
		a[low]=a[j];
		a[j]=temp;
			return j;
			
	}

}
