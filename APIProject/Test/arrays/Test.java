package arrays;

import java.util.Arrays;

public class Test {

	
	public static void main(String[] args)
	{
		int a[]= {1,2,3};
		permutations(a, 0);
		
	}
	
	public static void swap(int a[],int l,int h)
	{
		int temp;
		temp=a[l];
		a[l]=a[h];
		a[h]=temp;
	}
	
	public static void permutations(int a[],int cid)
	{
		if(cid==a.length-1)
		{
			printArray(a);
		}
		for(int i=cid;i<a.length;i++)
		{
			swap(a,i,cid);
			permutations(a,cid+1);
			swap(a,i,cid);
		}
	}
	
	public static void printArray(int a[])
	{
		System.out.println("\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
		
	}


