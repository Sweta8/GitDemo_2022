package sorting;

public class SelctionSort {
	
	public static void main(String[] args)
	{
		
		int a[]= {1,3,5,6,7,8,0,0,1};
		int min;
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			min=i;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
	}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}

}
}
