package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsTutorialThree 
{
static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		driver =new ChromeDriver();
	}

	@Test
	void totalnumberoflinks() throws InterruptedException 
	{
		driver.get("http://www.google.com/");
		Thread.sleep(3000);
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println("Total number of links on Google="+links.size());
		
	}

}
