package programmingInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class SumOfElementsInArrayIsEqualToSumUsingSet {
	
	public static void main(String[] args)
	{
	
		int a[]= {1, 4, 45, 6, 10, 8};
		int sum=16;
		Set<Integer> s=new HashSet<>();
		int temp;
		for(int i=0;i<a.length;i++)
		{
			temp=sum-a[i];
			if(s.contains(temp))
			{
				System.out.println(a[i]+" "+temp);
			}
			s.add(a[i]);
		}
		
}
}
