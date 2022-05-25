import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeProblem_Scroll {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		Thread.sleep(6000);
		js.executeScript("document.querySelector('.tableFixHead').scroll=500");
		
		int sum=0;
		List<WebElement> selectAmounts=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(WebElement selectAmount : selectAmounts)
		{
			 sum =sum+Integer.parseInt(selectAmount.getText());
		}
		
		System.out.println(sum);
		
		
		String totalAmt = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		System.out.println(totalAmt.split(":")[1].trim());
		
		if(String.valueOf(sum).equalsIgnoreCase(totalAmt.split(":")[1].trim()))
		{
			System.out.println("equal sum");
		}
		else
		{
			System.out.println("unequal");
		}
	}
	

}
