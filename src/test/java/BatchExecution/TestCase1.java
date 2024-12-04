package BatchExecution;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
public void honda() {
	WebDriver driver=new ChromeDriver();
 	//maximize 
 	driver.manage().window().maximize();
 	//waiting condition
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 	//enter into honda page
 	driver.get("https://www.honda2wheelersindia.com/");
 	driver.close();
}
	@Test
public void kawasaki() {
	WebDriver driver=new ChromeDriver();
 	//maximize 
 	driver.manage().window().maximize();
 	//waiting condition
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 	//enter into kawaski page
 	driver.get("https://kawasaki-india.com/");

 	assertEquals("mani", "manu");
 	
}
	@Test(dependsOnMethods = "kawasaki")
public void royalEnfield() {
	WebDriver driver=new ChromeDriver();
 	//maximize 
 	driver.manage().window().maximize();
 	//waiting condition
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 	//enter into royalEnfield page
 	driver.get("https://www.royalenfield.com/");
 	driver.close();
}

}
