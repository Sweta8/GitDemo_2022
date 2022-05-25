package sorting;

public class InsertionSort {
	
	public static void main(String[] args)
	{
		int a[]= {21,34,0,34,89,90};
		int key,j;
		for(int i=1;i<a.length;i++)
		{
			key = a[i];
			j=i-1;
			while(j>=0 && a[j]>key )
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
