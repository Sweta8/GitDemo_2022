import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section11_RealTimeExercises {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Get the no of links in the page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//get links in the footer section
		
		System.out.println(driver.findElements(By.cssSelector("#gf-BIG a")).size());
		
		//in footer section links count of first column only
		
		List<WebElement> allColumHeaders=driver.findElements(By.xpath("//div[@id='gf-BIG']//ul//li//h3//a"));
		for(WebElement columnName: allColumHeaders)
		{
			if(columnName.getText().contains("Discount Coupons"))
			{
				List<WebElement> linksInFirstColumn =driver.findElements(By.xpath("//div[@id='gf-BIG']//td[1]//a"));
				int s=linksInFirstColumn.size();
				for(int i=1;i<s;i++)
				{
					String clickOnTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
					
					linksInFirstColumn.get(i).sendKeys(clickOnTab);
					Thread.sleep(5000);
				}
			}
			
			Set<String> windows =driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			while(it.hasNext())
			{
				String childId=it.next();
				driver.switchTo().window(childId);
				System.out.println(driver.getTitle());
			}
		}
	}

}
