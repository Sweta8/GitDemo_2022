package programmingInterviewQuestions;

import java.util.Set;
import java.util.TreeSet;

public class MergeTwoSortedArray {
	
	public static void main(String[] args)
	{
		
	int a[]= {1,2,4,9};
	int b[]= {0,3,8,10};
	Set<Integer> s=new TreeSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		s.add(a[i]);
	}
	for(int i=0;i<b.length;i++)
	{
		s.add(b[i]);
	}
	
	System.out.println(s);
	}
}
