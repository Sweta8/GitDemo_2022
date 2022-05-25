

// Java Program to remove all the white spaces from a stringpackage String_JavaTpoint;

package String_JavaTpoint;
public class RemoveWhiteSpacesInString {
	
	public static void main(String[] args)
	{
        String str1="Remove white spaces";   
        
        System.out.println(str1.replaceAll("\\s+", ""));
	}

}
