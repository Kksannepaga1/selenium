package dropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestNG_DropDown 
{
	WebDriver driver;
  
	@Test
  public void dropdownselection () throws InterruptedException 
  {
		driver.get("http://baalabharathi.com/upload-story/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='field-5vlvjGcSKva7av0']")).sendKeys("517502");
		Thread.sleep(3000);
		
		Select c = new Select(driver.findElement(By.xpath("//select[@id='field-5gvECDat8HE4BHW']")));
		c.selectByVisibleText("Pakistan");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
