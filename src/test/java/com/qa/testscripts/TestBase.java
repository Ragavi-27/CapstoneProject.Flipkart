package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.qa.pages.FlipkartPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	WebDriver driver;
	FlipkartPages obj;
	
	@Parameters("url")
	@BeforeSuite
	public void setUp(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(url);
		obj = new FlipkartPages(driver);
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}


}
