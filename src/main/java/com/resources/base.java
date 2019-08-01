package com.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver;
	public Properties prop;
		
	public WebDriver initializeDriver() throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\SonalPatel\\GRE2EProject\\src\\main\\java\\com\\resources\\Data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		//String urlName = prop.getProperty("url");
		//System.out.println(urlName);
		
		//String browserName = "Chrome";
				if(browserName.equals("Chrome")){
				 driver = new ChromeDriver();
		}
	   return driver;
	}
	
}
