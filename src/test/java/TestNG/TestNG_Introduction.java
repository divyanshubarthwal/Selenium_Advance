package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Introduction {
	@Test
	public void demo() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=PoyQN0J-zac&list=PLzTvAeLiW8AcGgHD9ehSYlhHndlj95IKu&index=6");
		Thread.sleep(1000);
		driver.quit();
		
	}
	
}
