package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPages {

	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement popup;
	public WebElement getPopup() {
		return popup;
	}
	
	@FindBy(className="_2xm1JU")
	WebElement Logo;
	public WebElement getLogo() {
		return Logo;
	}
	
	@FindBy(name="q")
	WebElement searchBox;
	public WebElement getSearchBox() {
		return searchBox;
	}
	
	@FindAll(@FindBy(className="_4rR01T"))
	List<WebElement> items;
	public List<WebElement> getItems(){
		return items;
	}
	
	
	public FlipkartPages(WebDriver rdriver) {
		this.driver = rdriver;
	    PageFactory.initElements(rdriver, this);
	}
	
	

}
