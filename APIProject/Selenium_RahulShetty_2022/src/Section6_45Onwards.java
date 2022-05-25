import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section6_45Onwards {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//parent traverse
		//driver.findElement(By.xpath("//header/div/button[1]"));
		
		//sibling traverse
		//header/div/button[1]/following-sibling::button[2]
		
		//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		
		//parent to child and then to parent and then child
		//header//div//button[1]/following-sibling::button[2]//parent::div//parent::header//a
		
		//identify the link from practice tag using siblings and parent
		//header/div/button[1]//parent::div//parent::header//a[contains(text(),'Free Access')]
		
	}

}
