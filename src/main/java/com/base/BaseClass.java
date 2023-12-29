package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions act;
	
	// 1 Launch Browser
	public static WebDriver launchBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
		
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
			}
		else if (browsername.equalsIgnoreCase("firefox")) {
		
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
			
		}
		else if (browsername.equals("edge")){
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		}
	// 2 Get
	public static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;
	}
	// 3 Move to element
	public static void moveCursorActions(WebElement target) {
		act = new Actions(driver);
		act.moveToElement(target).perform();
	}


}
