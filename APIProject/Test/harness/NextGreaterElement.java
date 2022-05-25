package harness;

public class NextGreaterElement {
	
	public static void main(String[] args)
	{
		int a[]= {13,7,6,12};
		int max;
		for(int i=0;i<a.length;i++)
		{
			max=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
					break;
				}
			}
			if(max!=a[i])
			{
				System.out.println("next max of a[i] is"+ max);
			}
			else
			{
				System.out.println("Max does of a[i] does not exist"+ -1);
			}
		}
		
		
	}

}
