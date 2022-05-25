
//WAP to print output for 75689 as 70000+5000+600+80+9
package strings;

public class FreshworksSecondQuestion {
	
	public static void main(String[] args)
	{
		
		int a=97675689;
		String x=String.valueOf(a);
		int length=x.length();
		String sum="";
		int d;
		int i=0;
		while((a>0) && (length>i))
		{
			d=a%10;
			sum=String.valueOf((int)(d*Math.pow(10, i)))+"+"+sum;
			a=a/10;
			i++;
		}
		System.out.println(sum.trim().substring(0, sum.length()-1));
		
	}

}
