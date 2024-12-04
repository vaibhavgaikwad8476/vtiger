package com.crm.AdvanceSeleniumE4;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4 {
	@Test
	public void easyMyTrip() {
		WebDriver driver=new ChromeDriver();
	 	//maximize 
	 	driver.manage().window().maximize();
	 	//waiting condition
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 	//enter into easyMyTrip page
	 	driver.get("https://www.easemytrip.com/");
	 	driver.close();
	 	assertEquals("mani", "manu");
	}

}
