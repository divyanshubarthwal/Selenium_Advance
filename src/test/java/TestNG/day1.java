package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day1 {
	
	@Test(dependsOnMethods= {"daym"})
	public void day() {
		System.out.println("day1 method 1");
	}
	@AfterMethod
	public void after() {
		System.out.println("After method in day 1");
	}
	@AfterSuite
	public void suite() {
		System.out.println("After suite in day 1");
	}
	@Parameters({"URL","user"})
	@Test()
	public void daym(String urlname,String username) {
		System.out.println("day1 method 2");
		System.out.println(urlname);
		System.out.println(username);
	}


}
