package BatchExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
public void dws() {
	WebDriver driver=new ChromeDriver();
 	//maximize 
 	driver.manage().window().maximize();
 	//waiting condition
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 	//enter into Dws page
 	driver.get("https://demowebshop.tricentis.com/");
 	driver.close();
}


}
