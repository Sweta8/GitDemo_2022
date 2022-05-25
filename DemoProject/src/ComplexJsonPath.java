//1. Print No of courses returned by API
//2.Print Purchase Amount
//3. Print Title of the first course
//4. Print All course titles and their respective Prices
//5. Print no of copies sold by RPA Course
//6. Verify if Sum of all Course prices matches with Purchase Amount

import org.testng.Assert;

import files.Payload;
import files.ReusableMethods;
import io.restassured.path.json.JsonPath;

public class ComplexJsonPath {
	
	public static void main(String[] args)
	{
		JsonPath js=ReusableMethods.stringtoJsonPath(Payload.coursePrice());
		
		int courseSize=js.getInt("courses.size()");
		System.out.println("No of courses is "+ courseSize);
		
		int purchaseAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println("\nPurchase Amount is "+ purchaseAmount);
		
		String titleOffirstCourse=js.getString("courses.get(0).title");
		System.out.println("\nTitle of first course is "+ titleOffirstCourse+"\n");
		
		int sumOfCoursePrice=0;
		
		for(int i=0;i<courseSize;i++)
		{
			String courseTitlle=js.getString("courses.get("+i+").title");
			int coursePrice=js.getInt("courses.get("+i+").price");
			sumOfCoursePrice=sumOfCoursePrice+coursePrice*js.getInt("courses.get("+i+").copies");
			System.out.println(courseTitlle +" price is "+ coursePrice);
			if(courseTitlle.equalsIgnoreCase("RPA"))
			{
				int rpACourseCopies=js.getInt("courses.get("+i+").copies");
				System.out.println("\nNo of copies of RPA is "+ rpACourseCopies);
			}
				
		}
	
		
		Assert.assertEquals(purchaseAmount,sumOfCoursePrice);
	}

}
