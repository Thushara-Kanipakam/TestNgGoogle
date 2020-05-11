package com.testng.TestNGgroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchGoogle 
{
	public String baseUrl = "http://newtours.demoaut.com/";
    String driverPath = "C:\\THUSHARA\\ECLIPSEPROJECTS\\TestNGgroup\\src\\test\\java\\exefiles\\chromedriverU.exe";
    public WebDriver driver ; 
    
    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching browser"); 
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    
    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
   }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
}
