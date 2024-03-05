package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsTutorialOne {
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
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("karunasree");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("hello@1234");
		Thread.sleep(3000);
		//driver.findElement(By.className("form-submit")).click();
		Thread.sleep(3000);
		//we can use className or cssSelector
		driver.findElement(By.cssSelector(".form-submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("aravind"); 
		Thread.sleep(3000);
	}

}

