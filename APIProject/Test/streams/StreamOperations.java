package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
	
	public static void main(String[] args)
	{
		int a[]= {1,4,5,6,7,9,2,3,4,5,6,8,0,0};
		
		//Arrays.asList(1,4,5,6,7,9,2,3,4,5,6,8,0,0).stream().distinct().sorted().forEach(s->System.out.println(s));
		
		
		Arrays.stream(a).distinct().sorted().forEach(s->System.out.println(s));
		
		ArrayList<Integer> al=new ArrayList();
		
		for(int i: a)
		{
			al.add(i);
		}
		
		al.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		//Add to arrays
		
		
		
		
;	}
}
