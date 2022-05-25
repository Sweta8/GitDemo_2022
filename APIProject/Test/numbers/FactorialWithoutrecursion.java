package numbers;

public class FactorialWithoutrecursion {
	
	static long fact=1;
	public static long returnRecursion(int num)
	{
		while(num>0)
		{
			fact=fact*num--;
		}
		return fact;
	}
	
	public static void main(String[] args)
	{
		System.out.println(returnRecursion(5));
	}

}
