package AUTOIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// This will give Path of your project(Location)
		String downloadPath = System.getProperty("user.dir");

		// These 3 lines use to set default directory path
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);

		// Invoke chrome browser to download file as per the predernce in our project
		ChromeOptions options = new ChromeOptions();
		// whatever values you keep on pref it will stored as prefernce
		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//*[@id=\"browse\"]")).click();
		Thread.sleep(2000);

		// Selenium does not know how to call .exe file but java does
		// This will goto our system and execute exe file
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Documents\\AUTOITScript.exe");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li/div/div[3]")));
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/button")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[4]/a")));
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[4]/a")).click();

		Thread.sleep(60000);
		// In Java when we concatinate with path we Use forward slash "/" not backward
		File f = new File(downloadPath + "/converted.zip");

		if (f.exists())

		{

			Assert.assertTrue(f.exists());

			if (f.delete())

				System.out.println("file deleted");

		}

		driver.quit();
	}

}
