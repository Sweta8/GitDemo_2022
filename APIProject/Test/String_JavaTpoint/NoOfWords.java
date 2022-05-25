package String_JavaTpoint;

public class NoOfWords {
	
	public static void main(String[] args)
	{
		String x =" sweta is not eating and checing her phone constantly";
		x=x.toLowerCase().trim();
		String str[] = x.split("\\s+");
		System.out.println("No of words is "+ str.length);
	}

}
