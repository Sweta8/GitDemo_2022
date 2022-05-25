//Java Program to determine whether one string is a rotation of another

package String_JavaTpoint;

public class OneStringIsRotationOfAnother {
	
	public static void main(String[] args)
	{
		String x="abcde", y="deabc", z="";
		if(x.length()!=y.length())
		{
			System.out.println("Second string is not rotation of first string");
		}
		else 
		{
			z=x+x;
			if(z.contains(y))
				System.out.println("Rotaion");
			else
				System.out.println("Not roation");
		}
	}

}
