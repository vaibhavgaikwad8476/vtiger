package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsBaseClass {
	public static WebDriver driver;
    @BeforeClass
	public void preCondition() {
         driver=new ChromeDriver();
    	//maximize 
    	driver.manage().window().maximize();
    	//waiting condition
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	//enter into dws page
    	driver.get("https://demowebshop.tricentis.com/");
	}
    
    @BeforeMethod
    public void login() {
    	driver.findElement(By.className("ico-login")).click();
    	driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("admin01");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
    }
    @AfterMethod
    public void logout() {
    	driver.findElement(By.className("ico-logout"));
    }
    @AfterClass
    public void postCondition() {
    	driver.quit();
    }
}
