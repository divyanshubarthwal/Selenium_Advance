package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
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
	@Test
	public void daym() {
		System.out.println("day1 method 2");
	}


}
