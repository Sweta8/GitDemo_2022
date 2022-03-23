package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import io.cucumber.core.gherkin.messages.internal.gherkin.internal.com.eclipsesource.json.Json;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinitions extends Utils{

	ResponseSpecification rep;
	RequestSpecification res;
	Response response;
	TestDataBuild data=new TestDataBuild();
	static String place_id="";

	@Given("Add Place Payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException {
		// Write code here that turns the phrase above into concrete actions


		res = given().spec(requestSpecification()).body(data.addPlacePayLoad(name, language, address));

	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_Post_http_request(String resource, String method) {
		
		APIResources resourceAPI=  APIResources.valueOf(resource);
		
		rep = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(method.equalsIgnoreCase("POST"))
		{
			response = res.when().post(resourceAPI.getResource());
		}
		else if(method.equalsIgnoreCase("GET"))
		{
			response = res.when().get(resourceAPI.getResource());
		}
		else if(method.equalsIgnoreCase("DELETE"))
		{
			response = res.when().post(resourceAPI.getResource());
		}
		

	}

	@Then("the API call is success with the status code {int}")
	public void the_API_call_is_success_with_the_status_code(Integer statusCode) {

		Assert.assertEquals(response.getStatusCode(), statusCode.intValue());

	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String expect) {
		
		//Assert.assertEquals(getJsonPath(response, key), expect);


	}
	

	@Then("verify place_id created maps to {string} using {string}")
    public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
    // Write code here that turns the phrase above into concrete actions
		
		//String place_id =getJsonPath(response, "place_id");
      res= given().spec(requestSpecification()).queryParam("place_id", "90f01fc701738b4b1db319237e068b07");
      user_calls_with_Post_http_request(resource, "GET");
      //String actualName=getJsonPath(response, "name");
      //Assert.assertEquals(actualName, expectedName);
}

}
