package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		if(StepDefinitions.place_id=="")
		{
		StepDefinitions s=new StepDefinitions();
		s.add_place_payload_with("addidas", "jsr", "french");
		s.user_calls_with_Post_http_request("AddPlaceAPI", "POST");
		s.verify_place_id_created_maps_to_using("addidas", "GetPlaceAPI");
		}
		
	}

}
