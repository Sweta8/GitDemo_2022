package base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.Configuration;

public class Base {
	
	
	public static WebDriver driver;
	private Configuration config;
	
	public Base()
	{
		config = new Configuration("project.properties");
	}
	
	@BeforeClass
	public WebDriver intializeDriver() throws IOException
	{
		String browser =config.getConfig("browser"); 
		System.out.println("browser is"+browser);
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		if(browser.equals("ie"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	 @AfterClass
	    public void afterClass() {
	        driver.quit();
	        //additional tear down
	    }
	
	 @AfterMethod
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		org.apache.commons.io.FileUtils.copyFile(src, new File(destinationFile));
		return destinationFile;
		
	}
	
	

}
