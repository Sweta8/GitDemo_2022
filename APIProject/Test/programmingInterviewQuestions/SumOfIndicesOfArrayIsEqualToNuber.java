package programmingInterviewQuestions;

public class SumOfIndicesOfArrayIsEqualToNuber {
	
	public static void main(String[] args)
	{
		int a[]= {1,3,5,7,4,8};
		int sum=12;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]+a[j]==sum))
				{
					System.out.println(i+" "+j);
					a[j]='\0';
				}
			}
		}
	}

}
