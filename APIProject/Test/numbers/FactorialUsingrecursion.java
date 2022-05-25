package numbers;

public class FactorialUsingrecursion {
	
	static long fact;
	public static long returnFactorial(int num)
	{
		if(num==1)
			return 1;
		else fact=returnFactorial(num-1)*num;
		return fact;
	}
	
	public static void main(String[] args)
	{
		System.out.println(returnFactorial(5));
	}

}
