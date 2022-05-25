package strings;

import java.util.HashMap;
import java.util.Map;

public class practice {
	
	public static void main(String[] args)
	{
		int a[]= {1,3,4,1,2,3,3};
		int temp;
		boolean flag=false;
		int min;
		for(int i=0;i<a.length;i++)
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
