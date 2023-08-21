package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkart_Scenario_02 extends TestBase {
	
	@Test(priority=1)
	public void verifyingLogo() throws InterruptedException {
		if(obj.getPopup().isDisplayed()) {
			obj.getPopup().click();
		}
		
		Thread.sleep(2000);
		int xLoc = obj.getLogo().getLocation().getX();
		int yLoc = obj.getLogo().getLocation().getY();
		if(xLoc<=186 && yLoc<=10) {
			System.out.println("Logo is present on top left side");
		}
		else {
			Assert.assertTrue(false, "Logo is not present on top left side");
		}
		
	}
	
	@Test(priority=2)
	public void searchItem() throws InterruptedException {
		obj.getSearchBox().click();
		obj.getSearchBox().sendKeys("iphone 14");
		obj.getSearchBox().submit();
		Thread.sleep(2000);
		
		System.out.println("Total items displayed "+obj.getItems().size());
		List<WebElement> items = obj.getItems();
		items.get(0).click();
		Thread.sleep(2000);
		
		//verifying title
	    Assert.assertEquals("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com", 
	    		"APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com");
		
	}
	

}
