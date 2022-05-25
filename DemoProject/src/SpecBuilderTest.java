import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;

public class SpecBuilderTest {
	
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
	
	
	RequestSpecification req=  new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick")
	.setContentType(ContentType.JSON).build();
		
	ResponseSpecification rep =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		RequestSpecification res =given().spec(req)
				.body(a);
		
		String response= res.when().post("maps/api/place/add/json")
							.then().spec(rep).extract().response().asString();
		
		System.out.println(response);
	}

}
