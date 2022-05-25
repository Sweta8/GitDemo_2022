import java.io.IOException;
import java.util.ArrayList;

public class CheckValue {
	
	public static void main(String[] args) throws IOException
	{
		ArrayList<String> s=DatatDrivenTest2.getData();
		System.out.println(s.size());
		
		for(int i=0;i<s.size()-1;i++)
		{
			System.out.println(s.get(i+1));
		}
		
	}

}
