package com.inetBanking.testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(6000);
		driver.findElement(By.id("details-button")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(6000);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassWord(password);
		lp.clickSubmit();
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		// Assert marquee
		assertEquals("Welcome To Manager's Page of Guru99 Bank", driver.findElement(By.xpath("//marquee")).getText());

	}

}
