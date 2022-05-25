package check;

import java.util.ArrayList;
import java.util.List;

public class Parctice {
	
		public static void main(String [] args)
		{
			int a[]= {1,3,2,3,2,0,0};
			List<Integer> al=new ArrayList<>();
			for(int i=0;i<a.length;i++)
			{
				al.add(a[i]);
			}
			
			al.stream().distinct().sorted().forEach(s->System.out.println(s));
		}
	}
