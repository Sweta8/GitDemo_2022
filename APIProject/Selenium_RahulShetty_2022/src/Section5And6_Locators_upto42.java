import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section5And6_Locators_upto42 {
	
	public static void main(String[] args) throws InterruptedException
	{
		String userName="swetasingh";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Sweta");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sweta Singh");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("swetacjc@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//driver.findElement(By.xpath("input[type='text']:nth-child(3)")).sendKeys("swetacjc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("swetacjc@gmail.com");
		driver.findElement(By.xpath("//form//input[3]")).sendKeys("7204745967");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String text =driver.findElement(By.cssSelector("form p")).getText();
		String password= text.split("password '")[1].split("' to")[0];
		System.out.println(password);
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
		Thread.sleep(3000);
		String actualText=driver.findElement(By.tagName("p")).getText();
		System.out.println(actualText);
		Assert.assertEquals("You are successfully logged in.", actualText);
		String actualText1=driver.findElement(By.cssSelector(".login-container h2")).getText();
		System.out.println(actualText1);
		System.out.println("Hello "+userName+",");
		Assert.assertEquals(actualText1, "Hello "+userName+",");
		driver.findElement(By.xpath("//button[text()='Log Out']"));
		
		
		
	}

}
  