package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsTutorial
{
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void test() throws InterruptedException 
	{
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("karunasreek");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Kar34@");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("email")).clear();
		//Thread.sleep(3000);
		//driver.findElement(By.id("sreeannepaga"));
	}

}
