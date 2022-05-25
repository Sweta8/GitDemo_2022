import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_50Onwards {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		
//         Select s=new Select(element);
		// Selection of Currency dropdown

//		WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select s = new Select(element);
//		s.selectByIndex(2);
//		String selectedElement = s.getFirstSelectedOption().getText();
//		Assert.assertEquals("AED", selectedElement);
//		Thread.sleep(2000);
//		s.selectByValue("USD");
//		String selectedElement1 = s.getFirstSelectedOption().getText();
//		Assert.assertEquals("USD", selectedElement1);
//		Thread.sleep(2000);
//		s.selectByVisibleText("AED");
//		String selectedElement2 = s.getFirstSelectedOption().getText();
//		Assert.assertEquals("AED", selectedElement2);
//		Thread.sleep(2000);
//
//		// Select passengers dropdown
//
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
//		int i = 1;
//		while (i < 5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			Thread.sleep(3000);
//			i++;
//		}
//
//		String passengerDropdownValue = driver.findElement(By.id("divpaxinfo")).getText();
//		System.out.println(passengerDropdownValue);
		
		
		// Select From And To
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//a[@value='MAA'])")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		//Select From and To using dynamic xpath
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']/parent::div//a[@value='MAA']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']/parent::div//a[@value='BLR']")).click();
		
		
		//Select from COUNTRY
		
	String country ="Ind";
	driver.findElement(By.id("autosuggest")).sendKeys(country);
	Thread.sleep(3000);
	String countryToSelect="Indonesia";
	List<WebElement> elements=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for(WebElement e: elements)
	{
		if(e.getText().equalsIgnoreCase(countryToSelect))
		{
			e.click();
			break;
		}
	}
//	
		//Checkbox 
		
//	WebElement seniorCitizenCheckbox=driver.findElement(By.cssSelector("input[id *='SeniorCitizenDiscount']"));
//		if(!seniorCitizenCheckbox.isSelected())
//		{
//			seniorCitizenCheckbox.click();
//			Assert.assertEquals(seniorCitizenCheckbox.isSelected(), true);
//		}
//		
//	}
//		Thread.sleep(10000);
//		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		System.out.println(checkboxes.size());
//		for(WebElement checkbox: checkboxes)
//		{
//			Thread.sleep(2000);
//			if(!checkbox.isSelected())
//			{
//				JavascriptExecutor jse = (JavascriptExecutor) driver;
//				jse.executeScript("arguments[0].click();", checkbox);
//				Assert.assertTrue(checkbox.isSelected());
//			}
//		}
		
		
		//calendar
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']/parent::div//a[@value='MAA']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']/parent::div//a[@value='BLR']")).click();
//		//driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
//		
//		//List<WebElement> dates =driver.findElements(By.cssSelector("td[data-handler='selectDay'] a"));
//		WebElement datePickerMonth  =driver.findElement(By.cssSelector("span.ui-datepicker-month"));
//		WebElement datePickerYear= driver.findElement(By.cssSelector("span.ui-datepicker-year"));
//		String month = "May";
//		String year="2022";
//		Thread.sleep(3000);
//		try
//		{
//		while(!(datePickerMonth.getText().contains("June") && datePickerYear.getText().contains("2022")))
//				{
//			Thread.sleep(3000);
//				driver.findElement(By.xpath("//span[text()='Next']")).click();
//			}
//		}catch(StaleElementReferenceException e)
//			{
//				while(!(datePickerMonth.getText().contains("June") && datePickerYear.getText().contains("2022")))
//				{
//			Thread.sleep(3000);
//				driver.findElement(By.xpath("//span[text()='Next']")).click();
//			}
//				}
//		Thread.sleep(3000);
//				List<WebElement> dates=driver.findElements(By.xpath("//span[text()='"+month+"']/../../../table/tbody//td//a"));
//				for(WebElement date : dates)
//				{
//					if(date.getText().contains("29"));
//					date.click();
//					break;
//				}
				
		
		//Enabled & disabled
		
//		WebElement checking=driver.findElement(By.id("Div1"));
//		if(checking.getAttribute("style").contains("0.5"))
//		{
//			System.out.println("disabled");
//		}
//		else
//		{
//			System.out.println("enabled");
//		}
//		checking.click();
//		if(checking.getAttribute("style").contains("0.5"))
//		{
//			System.out.println("disabled");
//		}
//		else
//		{
//			System.out.println("enabled");
//		}
		
	
		
		
	}

}
