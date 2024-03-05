package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class KarunaOne
{
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		driver.quit();
	}

	@Test
	void test1() {
		driver.get("http://www.google.com");
	}
	@Test
	void test2() {
		driver.get("http://www.twitter.com");
	}@Test
	void test3() {
		driver.get("http://www.facebook.com");
	}
	@Test
	void test4() {
		driver.get("http://www.selenium.dev");
	}
	@Test
	void test5() {
		driver.get("http://www.redmine.org");
	}

}
