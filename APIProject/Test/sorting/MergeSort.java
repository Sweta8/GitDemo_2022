package sorting;

public class MergeSort {
	
	public static void main(String[] args)
	{
		int a[]= {10,30,1,0,3,4,2,1};
		MergeSort m=new MergeSort();
		m.mergeSort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
	public void mergeSort(int a[],int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid=(low+high)/2;
			mergeSort(a, low, mid);
			mergeSort(a, mid+1,high);
			merge( a, mid,low, high);
			
		}
	}
	public static void  merge(int a[],int mid,int low,int high)
	{
		int b[]=new int [100];
		int i=low,k=low;
		int j=mid+1;
		while(i<=mid && j<=high)
		{
			if(a[i]<a[j])
			{
				b[k]=a[i];
				k++;
				i++;
			}
			else
			{
				b[k]=a[j];
				k++;
				j++;
			}
		}
		
		while(i<=mid)
		{
			b[k]=a[i];
			k++;
			i++;
		}
		
		while(j<=high)
		{
			b[k]=a[j];
			k++;
			j++;
		}
		
		for(int l=low;l<=high;l++)
		{
			a[l]=b[l];
		}
		
	}
	

}
