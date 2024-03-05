package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorTutorialsFour
{

	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		driver = new ChromeDriver();
	}

	@Test
	void xpath() throws InterruptedException 
	{
	driver.get("http://www.redmine.org/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("karuna");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hello@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/form[1]/label[3]/input[1]")).click();
	
	
	}

}
