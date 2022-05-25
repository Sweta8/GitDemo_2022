package numbers;

public class MaximumOf3NosUsingTernanry {
	
public static void main(String[] args)
{
	int a =5,b=4,c=3,max;

	max = (a>b && a>c)? (a): ((b>c)? b: c );
	System.out.println(max);
}



}
