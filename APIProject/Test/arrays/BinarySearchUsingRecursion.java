package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchUsingRecursion {
	
	
	public static int  search(int a[],int first,int last,int value)
	{
		int mid;
		while(first<=last)
		{
			mid=(first+last)/2;
			if(a[mid]==value)
			{
				return mid;
			}
			else if(a[mid]<value)
				return search(a,mid+1,last,value);
			else 
				return search(a,first,mid-1,value);
		}
		return -1;
		
	}
	
	public static void main(String[] args)
	{
		int a[]= {1,3,5,2,4,5,8};
		int b[]=new int[a.length];
		List<Integer> al=new ArrayList<Integer>();
		for(int i: a)
		{
			al.add(i);
		}
		Collections.sort(al);
		Object[] c=al.toArray();
		for(int i=0;i<b.length;i++)
		{
			b[i]= (int) c[i];
		}
		int result = search(b,0,b.length-1,92);
		if (result == -1)  
        System.out.println("Element is not found!");  
    else  
        System.out.println("Element is found at index: "+result);  
		
	        }
	}

