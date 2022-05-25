package harness;

public class PeekElementInAnArray {
	
	public static void main(String[] args)
	{
		int a[]= { 1, 3, 20, 4, 1, 0 };
		
		
			if(a.length==0)
			{
				System.out.println("array is empty");
			}
			else if(a[0]>a[1])
			{
				System.out.println(0);
			}
			else if(a[a.length-1]>a[a.length-2])
			{
				System.out.println(a.length-1);
			}
			else 
			{
			for(int i=1;i<a.length-1;i++)
			{
				if((a[i]>=a[i-1]) &&(a[i]>=a[i+1]))
				{
				System.out.println(i);
				}
			}
		}
	}

}
