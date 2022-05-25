import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesSwitching {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement firstObject = driver.findElement(By.id("draggable"));
		WebElement secondObject=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(firstObject, secondObject).perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Accept")).click();
		
		 
	}

}
