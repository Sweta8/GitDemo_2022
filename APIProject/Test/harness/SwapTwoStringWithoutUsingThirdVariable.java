package harness;

public class SwapTwoStringWithoutUsingThirdVariable {
	
	public static void main(String[] args)
	{
		String x="swetadddddd";
		String x1="singhii";
		x=x+x1;
		System.out.println("x "+ x.substring(x.length()-x1.length()));
		System.out.println("x1 "+ x.substring(0,x.length()-x1.length()));
	}

}
