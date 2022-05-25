import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

import files.ReusableMethods;

public class JiraTest {
	
	
	public static void main(String[] args)
	{
		
		RestAssured.baseURI="https://jira.dev.lithium.com";
		
		
		//Get JSESSIONID
		
//		String resposne=given().log().all().header("Content-Type", "application/json")
//		.body("{ \"username\": \"sweta.singh\", \"password\": \"Roche@123456789000\" }")
//		.when().post("rest/auth/1/session")	
//		.then().log().all().assertThat().statusCode(200).extract().response().asString();
//		
//		JsonPath js=ReusableMethods.stringtoJsonPath(resposne);
//		String name =js.getString("session.name");
//		String value=js.getString("session.value");
//		String sessionID=name+"="+value;
//		System.out.println(sessionID);
		
		SessionFilter session=new SessionFilter();
		
		String resposne=given().log().all().header("Content-Type", "application/json")
		.body("{ \"username\": \"sweta.singh\", \"password\": \"Roche@123456789000\" }").filter(session)
		.when().post("rest/auth/1/session")	
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
				
				
			
		
		
		//Add comment
		
//		given().log().all().pathParam("issueId", "CALIBR-372").header("Cookie", sessionID ).header("Content-Type", "application/json")
//		.body("{\n"
//				+ "    \"body\": \"Hey check\"\n"
//				+ "        \n"
//				+ "    }\n"
//				+ "}")
//		.when().post("rest/api/2/issue/{issueId}/comment")
//		.then().log().all().assertThat().statusCode(201);
		
		given().log().all().pathParam("issueId", "CALIBR-372").header("Content-Type", "application/json")
		.body("{\n"
				+ "    \"body\": \"Hey checking\"\n"
				+ "        \n"
				+ "    }\n"
				+ "}").filter(session)
		.when().post("rest/api/2/issue/{issueId}/comment")
		.then().log().all().assertThat().statusCode(201);
		
		
		//Add attachment
		
		given().log().all().pathParam("issueId", "CALIBR-372").header("X-Atlassian-Token","no-check").filter(session)
		.header("Content-Type", "multipart/form-data")
		.multiPart("file",new File("jira.txt"))
		.when().post("/rest/api/2/issue/{issueId}/attachments")
		.then().log().all().statusCode(200);
		
		
		//Get issue details
		
		String getIssueResponse = given().log().all().pathParam("issueId", "CALIBR-372").filter(session).queryParam("fields", "comment")
		.when().get("rest/api/2/issue/{issueId}")
		.then().log().all().statusCode(200).extract().response().asString();
		
		System.out.println(getIssueResponse);
		
		
		
	}

}
