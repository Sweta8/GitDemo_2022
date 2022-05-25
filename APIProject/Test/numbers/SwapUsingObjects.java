package numbers;

import java.util.Arrays;

public class SwapUsingObjects{
	
	public static void main(String[ ]args)
	{
		Employee obj1=new Employee(5, 10);
		Check obj=new Check();
		System.out.println(obj1.id1+" "+obj1.id2);
		obj.swap(obj1);
		System.out.println(obj1.id1+" "+obj1.id2);
	}

}


class Employee
{
	int id1,id2;
	public Employee(int id1,int id2) {
		
		this.id1=id1;
		this.id2=id2;
		
	}
}

class Check
{
	public void swap(Employee e)
	{
		int temp;
		temp=e.id1;
		e.id1=e.id2;
		e.id2=temp;
	}
}
