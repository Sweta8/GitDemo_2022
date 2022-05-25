import static io.restassured.RestAssured.given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import files.ReusableMethods;
import io.restassured.path.json.JsonPath;
public class oAuthTest {
	
	
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
		
		String u="https://rahulshettyacademy.com/getCourse.php?code=4%2F0AX4XfWg7IHi_mNtQbPXU_bgT0_2LmOvkrS31cRsR2AfyCnQwulwmFV64MoYdjd2Lq0IG7w&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=2&prompt=none";
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
		
		
		
		
		String response =given().log().all().queryParam("access_token", ""+accessToken+"")
		.when().get("https://rahulshettyacademy.com/getCourse.php").asString();
		
		System.out.println(response);
	}

}
