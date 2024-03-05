package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_3_Ignore_Skip_Disable
{
	WebDriver driver;
  @Test(priority=1,enabled=false)
  public void twitter()
  {
	  driver.get("http://www.twitter.com");
  }
  @Test(priority=5)
  public void facebook()
  {
	  driver.get("http://www.facebook.com");
  } 
  @Test(priority=2,enabled=false)
  public void google()
  {
	  driver.get("http://www.google.com");
  }
  @Test(priority=3,enabled=true)
  public void selenium()
  {
	  driver.get("http://www.selenium.com");
  }
  @Test(priority=1,enabled=false)
  public void redmine()
  {
	  driver.get("http://www.redmine.org");
  }
  @Test(priority=4,enabled=false)
  public void gmail()
  {
	  driver.get("http://www.gmail.com");
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
