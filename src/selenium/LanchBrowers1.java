package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LanchBrowers1 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver =new ChromeDriver();
		driver =new EdgeDriver();
		//driver =new FirefoxDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
	}

}
