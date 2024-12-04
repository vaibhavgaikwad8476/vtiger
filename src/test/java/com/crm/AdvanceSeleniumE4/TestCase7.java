package com.crm.AdvanceSeleniumE4;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase7 {
	@Test
	public void flipkart() {
		WebDriver driver=new ChromeDriver();
	 	//maximize 
	 	driver.manage().window().maximize();
	 	//waiting condition
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 	//enter into flipkart page
	 	driver.get("https://www.flipkart.com/");
	 	driver.close();
	}

}
