import io.restassured.RestAssured;
import pojo.AddPlace;
import pojo.Location;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;


public class SerializeTest {
	
	public static void main(String[] args)
	
	{
	AddPlace a=new AddPlace();
	a.setAccuracy(50);
	a.setName("Frontline house");
	a.setPhone_number("+91) 983 893 3937");
	a.setAddress("29, side layout, cohen 09");
	a.setWebsite("http://google.com");
	a.setWebsite("French-IN");
	List<String> myList=new ArrayList<String>();
	myList.add("shoe park");
	myList.add("shop");
	a.setType(myList);
	a.setLanguage("French-IN");
	Location l=new Location();
	l.setLat(-38.383494);
	l.setLng(33.427362);
	a.setLocation(l);
	
	

	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String response =given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(a).log().all()
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
	}

}
