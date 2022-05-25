
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.Payload;
import files.ReusableMethods;

public class Basics {
	
	public static void main(String[]args)
	{
		//Add Place
		
		//RestAssured.baseURI= "https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.addPlace()).when().post("https://rahulshettyacademy.com//maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		JsonPath js= ReusableMethods.stringtoJsonPath(response);
		String place_id=js.getString("place_id");
		System.out.println("\n"+place_id);
		
		//Update Place
		String newAddress="sonari";
		
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id",place_id).header("Content-Type","application/json")
		.body(Payload.putPlace(place_id,newAddress)).when().put("https://rahulshettyacademy.com/maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"))
		.header("server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		

		
		//Get Place
		
		String response1= given().log().all().queryParam("place_id", place_id).queryParam("key", "qaclick123").header("Content-Type","application/json")
		.when().get("https://rahulshettyacademy.com/maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).body("address", equalTo(newAddress))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		JsonPath js1= ReusableMethods.stringtoJsonPath(response1);
		String addressfromGet=js1.getString("address");
		Assert.assertEquals(newAddress, addressfromGet);
		
		
		
		
		
	}

}
