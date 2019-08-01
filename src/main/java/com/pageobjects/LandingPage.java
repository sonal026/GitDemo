package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By image=By.xpath("//a[@class='logo']//img");
	By title=By.xpath("//div[@class='welcome']//h2");
	By login=By.cssSelector("[class*='button login']");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getTitle(){
		return driver.findElement(title);
	}
	
	public WebElement getImage(){
		return driver.findElement(image);
	}
	
	public WebElement getLogin(){
		return driver.findElement(login);
	}
	
	
	

}
