package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest 
{
	WebDriver driver;
	
  @Test
  public void isdisplayedmethod() throws InterruptedException
  {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(3000);
	  boolean hlp =driver.findElement(By.xpath("//a[@class='help'")).isDisplayed();
	  
	  if(hlp==true)
	  {
		  System.out.println("Help menu is available on top menu bar");
		  driver.findElement(By.xpath("//a[@class='help']")).click();
	  }
	  else
	  {
		  System.out.println("Help menu is not available on top menu bar");
	  }
  }
  
  @Test
  public void isenabledmethod() throws InterruptedException
  {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(3000);
	  boolean log =driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();
	  
	  if(log==true)
	  {
		  System.out.println("Login text box is enabled to enter username");
		  driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
	  }
	  else
	  {
		  System.out.println("Login text box is not enabled to enter username");
	  }
  }
  
  @Test
  public void isselectedmethod() throws InterruptedException
  {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(3000);
	  boolean check =driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
	  
	  if(check==true)
	  {
		  System.out.println("Stay logged in check box field is Selected");
		  driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
	  }
	  else
	  {
		  System.out.println("Stay logged in check box field is Not Selected");
	  }
  }
  @BeforeTest
  public void beforeTest()
  {
	    driver =new ChromeDriver();
	    driver.manage().window().maximize();
  }

}
