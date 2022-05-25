package numbers;

public class SumUsingRecursion {
	
	static long fact;
	
	public static long factorial(int num)
	{
		if(num==1)
			return 1;
		else fact=factorial(num-1)+num;
		return fact;
	}
	
	public static void main(String[] args)
	{
		System.out.println(factorial(6));
	}

}
