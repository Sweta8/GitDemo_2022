
//3) Java Program to count the total number of punctuation characters exists in a String

package String_JavaTpoint;

public class NumberOfPunctuationsInString {
	
	public static void main(String[] args)
	{
		String x="sweta ? ghuij? ????   ";
		String y=x.replace(" ", "");
		int initialcharacters=y.length();
		String m=y.replace("?", "");
		int finalCharacters=m.length();
		System.out.println("No of ?s are "+(initialcharacters-finalCharacters));
	}

}
