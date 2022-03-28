package com.crm.Vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest
{
    @Test
    public void getdata()
    {
    	String browser=System.getProperty("browser");
    	String url=System.getProperty("url");
    	String username=System.getProperty("username");
    	String password=System.getProperty("password");
    	WebDriver driver=null;
    	if(browser.equalsIgnoreCase("chrome"))
    	{
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	}
    	else if(browser.equals("firefox"))
    	{
    		WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    	}
    	else if(browser.equals("edge"))
    	{
    		WebDriverManager.edgedriver().setup();
    		driver=new EdgeDriver();
         }
    	else
    	{
    		System.out.println("specify valid browser");
    	}
    	
    	
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.get(url);
    	driver.findElement(By.name("user_name")).sendKeys(username);
    	driver.findElement(By.name("user_password")).sendKeys(password);
    	driver.findElement(By.id("submitButton")).click();
    	
    }
}