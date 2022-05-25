import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import files.ReusableMethods;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import pojo.API;
import pojo.GetCourse;
import pojo.WebAutomation;

public class oAuthWithPojo {

	
	public static void main(String[] args)

	{
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state =verifycode");
//		WebElement emailID=driver.findElement(By.xpath(""));
//		emailID.sendKeys("swetacjc@fmail.com");
//		WebElement password=driver.findElement(By.xpath(""));
//		password.sendKeys("Carmel@19994");
//		WebElement submit=driver.findElement(By.xpath(""));
//		submit.click();
//		String codeUrl=driver.getCurrentUrl();
		
		String[]courseTitles = {"Selenium Webdriver Java", "Cypress","Protractor"};
		
		String u="https://rahulshettyacademy.com/getCourse.php?code=4%2F0AX4XfWjij-EyNPnTRb3FhjITiOI2BlJ2y18ODPNgvIBR9cQ6WlVYApxkmAPcV3HN3mhuCw&scope=email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&authuser=2&prompt=none";
		String split1=u.split("code=")[1];
		String code=split1.split("&scope=")[0];
		System.out.println(code);
		
		given().log().all()
		.queryParam("auth_url", "https://accounts.google.com/o/oauth2/v2/auth")
		.queryParam("scope", "https://www.googleapis.com/auth/userinfo.email")
		.queryParam("auth_url", "https://accounts.google.com/o/oauth2/v2/auth");
		
		
		
		String accessTokenresponse = given().urlEncodingEnabled(false).log().all()
		.queryParam("code", ""+code+"")
		.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.queryParam("grant_type", "authorization_code")
		.when().post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath js=ReusableMethods.stringtoJsonPath(accessTokenresponse);
		String accessToken = js.getString("access_token");
		
		
		
		
		GetCourse gc =given().log().all().queryParam("access_token", ""+accessToken+"").expect().defaultParser(Parser.JSON)
		.when().get("https://rahulshettyacademy.com/getCourse.php").as(GetCourse.class);
		
		// get the linkedInUrl and Instructor
		System.out.println("LinkedIn url is"+ gc.getLinkedIn());
		System.out.println("Instructor is"+ gc.getInstructor());
		
		
		//Get title of SoapUI Webservices testing
		
		System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());
		
		//above to get the title using index is not correct
		
		List<API> apis =gc.getCourses().getApi();
		
		for(int i=0;i<apis.size();i++)
		{
			if(apis.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing"))
			{
				System.out.println(apis.get(i).getCourseTitle());
				System.out.println(apis.get(i).getPrice());
				break;
			}
		}
		
		//Print all the title names of WebAutomation and match if actual is equal to expected
		
		List<WebAutomation> webs=gc.getCourses().getWebAutomation();
		ArrayList<String> expectedArrayList=new ArrayList<String>();
		for(int i=0;i<webs.size();i++)
		{
			expectedArrayList.add(webs.get(i).getCourseTitle());
		}
		List<String> actualCoursesList= Arrays.asList(courseTitles);
		
		Assert.assertEquals(actualCoursesList, expectedArrayList);
		
		
		
		
		
		
		
	}
}
