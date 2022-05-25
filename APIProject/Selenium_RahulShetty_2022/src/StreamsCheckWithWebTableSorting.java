import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamsCheckWithWebTableSorting {
	
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.linkText("Top Deals")).click();
		String parentId,childId;
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> itr=windowHandles.iterator();
		while(itr.hasNext())
		{
			parentId= itr.next();
			childId=itr.next();
			driver.switchTo().window(childId);
		}
		
		WebElement columnName=driver.findElement(By.xpath("//span[text()='Veg/fruit name']"));
		columnName.click();
		List<WebElement> elements=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> originalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList = elements.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
		//get price of bean
		do
		{
			List<WebElement> elementsList=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		 price =elementsList.stream().filter(s->s.getText().equals("Beans")).map(s->getPrice(s)).collect(Collectors.toList());
		
		price.forEach(s->System.out.println(s));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
	
		driver.close();
		driver.quit();
		
		
	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price;
		price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
	
	

}
