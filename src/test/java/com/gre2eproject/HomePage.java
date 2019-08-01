package com.gre2eproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjects.LandingPage;
import com.resources.base;

public class HomePage extends base{
	
	@BeforeTest
	public void initialize() throws IOException{
		driver = initializeDriver();
		System.out.println("I m in initialize");
		
	}	
	
	@Test
	public void HomePageNavigation(){
		System.out.println(prop.getProperty("url"));
		//String url = "https://registry.thebay.com/registry/";
		driver.get(prop.getProperty("url"));	
		//driver.get("https://registry.thebay.com/registry/");
		//This things are precautions so we make sure page is loaded and elements are displayed
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void getImageSrc(){
		
		LandingPage lp = new LandingPage(driver);
		String HomePageImage = lp.getImage().getAttribute("src");
		System.out.println(HomePageImage);
	}
	
	@Test
	public void getTitle(){
		
		LandingPage lp = new LandingPage(driver);
		String HomePageTitle = lp.getTitle().getText();
		System.out.println(HomePageTitle);
	}
	
	@Test
	public void clickLogin(){
		
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		System.out.println("I clicked on login");
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
		//empty the memory
		driver = null;
	}

}
