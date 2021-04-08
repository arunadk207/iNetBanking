package com.inetBanking.testCases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

public class BaseClass {
	public String baseURL = "https://demo.guru99.com/v4/";
	public String username = "mngr318284";
	public String password = "YpYjAsa";
	public static WebDriver driver;
	
	private static Logger logger= Logger.getLogger(BaseClass.class);

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Hello");
		
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
