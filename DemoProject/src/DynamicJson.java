import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.Payload;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;


public class DynamicJson {
	
	//add Books
	@Test(dataProvider = "getData")
	public void addBook(String isbn, String aisle,String c)
	{
		System.out.println(c);
		
		RestAssured.baseURI="http://216.10.245.166";
		
		String response = given().log().all().header("Content-Type", "application/json")
		.body(Payload.addBook(isbn,aisle))
		.when()
		.post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js=ReusableMethods.stringtoJsonPath(response);
		String id = js.getString("ID");
     	System.out.println("Id is "+ id);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {{"345","isbn","check"},{"3445","fjjf","check"}};
	}
	
	
	//DeleteBooks
	
//	@Test
//	public void DeleteBook()
//	{
//		given().log().all()
//	}

}
