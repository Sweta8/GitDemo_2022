import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesScenario {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector(".blinkingText")).click();


		
		
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> its =windows.iterator();
		String parentId =its.next();
		String childId=its.next();
		driver.switchTo().window(childId);
		String emailId =driver.findElement(By.xpath("//p[@class='im-para red']")).getText().trim().split("at ")[1].split(" with")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
		
		
	}

}
