package programmingInterviewQuestions;

public class SumOfDigits {
	
	public static void main(String[] args)
	{
		int a =23456;
		int d,sum=0;
		while(a>0)
		{
			d=a%10;
			sum=sum+d;
			a=a/10;
		}
		System.out.println("Sum of Digits is "+sum);
	}

}
