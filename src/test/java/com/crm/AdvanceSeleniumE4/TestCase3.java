package com.crm.AdvanceSeleniumE4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test
public void redbus() {
	WebDriver driver=new ChromeDriver();
 	//maximize 
 	driver.manage().window().maximize();
 	//waiting condition
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 	//enter into Redbus page
 	driver.get("https://www.redbus.in/");
 	driver.close();
}
}
