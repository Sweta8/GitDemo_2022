package sorting;

public class BubbleSort {
	
	public static void main(String[] args)
	{
	int a[]= {9,3,6,7,2,3};
	int temp=0;
	boolean flag=false;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=true;
			}
		}
		if(flag==false)
			break;
		else
			flag=false;
	}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}


}
