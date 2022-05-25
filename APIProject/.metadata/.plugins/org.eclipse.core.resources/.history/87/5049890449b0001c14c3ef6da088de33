import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPractice {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		WebElement yearandMonth =driver.findElement(By.xpath("(//thead//tr//th[@class='datepicker-switch'])[1]"));
		while(!yearandMonth.getText().contains("June 2022"))
		{
			driver.findElement(By.xpath("(//thead//tr//th[@class='datepicker-switch'])[1]/following-sibling::th")).click();
		}
		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}
	}

}
}
