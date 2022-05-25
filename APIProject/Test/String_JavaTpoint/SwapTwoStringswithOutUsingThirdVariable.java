package String_JavaTpoint;

public class SwapTwoStringswithOutUsingThirdVariable {
	
	
	public static void main(String[] ars)
	{
		String x="Sweta", y="dancing";
		x=x+y;
		y=x.substring(0,x.length()-y.length());
		x=x.substring(y.length(),x.length());
		System.out.println(y);
		System.out.println(x);
		
	}
	

}
