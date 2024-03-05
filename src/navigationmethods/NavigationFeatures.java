package navigationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationFeatures {
		static WebDriver driver;
		public static void main(String[] args) throws Exception
		{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("hhtps://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("hhtps://www.facebook.com");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

}
