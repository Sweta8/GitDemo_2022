package sorting;

public class Test {
	
	public static void main(String[] args) {
		
		A a=new C();
		a.run();
		a.wish();
}
}
class A
{
	static void run()
	{
System.out.println("In A run");
	}
	
	 void wish()
	{
System.out.println("In A wish");
	}
}

class B extends A
{
	
	static void run()
	{
System.out.println("In B run");
	}
	
	 void wish()
	{
System.out.println("In B wish");
	}
}

class C extends A
{
	
	static void run()
	{
System.out.println("In C run");
	}
	
	 void wish()
	{
System.out.println("In C wish");
	}
}

	
