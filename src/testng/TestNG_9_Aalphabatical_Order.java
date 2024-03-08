package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_9_Aalphabatical_Order 
{
	WebDriver driver;
 
	@Test
  public void redmine() 
  {
	 driver.get("http://www.redmine.org/");
  }
  
	@Test
  public void schools9() 
  {
	  driver.get("http://www.schools9.com/");
  }
	
  @Test
  public void flipkart()
  {
	  driver.get("https://www.flipkart.com/");
  }
  
  @Test
  public void twitter()
  {
	  driver.get("https://www.twitter.com");
  }
  
  @Test
  public void selenium()
  {
	  driver.get("https://www.selenium.com");
  }
  
  @Test
  public void gmail()
  {
	  driver.get("https://www.gmail.com");
  }
 
  @BeforeTest
  public void beforeTest() 
  {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest() 
  { 
	  driver.quit();
  }

}
