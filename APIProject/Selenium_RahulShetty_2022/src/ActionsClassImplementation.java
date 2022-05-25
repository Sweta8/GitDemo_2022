import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassImplementation {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
		Actions act=new Actions(driver);
		act.moveToElement(signIn).build().perform();
		
		WebElement editBox=driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(editBox).click().keyDown(Keys.SHIFT).sendKeys("ghello").doubleClick().build().perform();
		act.moveToElement(signIn).contextClick().build().perform();
		
		
		
		
	}

}
