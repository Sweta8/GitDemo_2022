
//Java Program to divide a string in 'N' equal parts.

package String_JavaTpoint;

public class DivideStringIntoNEqualParts {
	
	public static void main(String[] args)
	{
		String x="sweta is dancing";
		int noOfParts=8;
		if(x.length()%noOfParts!=0)
		{
			System.out.println("cannot divide into equal parts");
		}
		else
		{
		int length=x.length()/noOfParts;
		int i=0;
		while(i<x.length())
		{
			System.out.println(x.substring(i, i+length));
			i=i+length;
		}
	}

}
}
