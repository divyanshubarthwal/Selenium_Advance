package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Introduction {
	@Test
	public void demo() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		driver.quit();
		
	}
	
}
