package TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"Smoke"})
	public void Login() {
		System.out.println("day2 method 1");
		
	}
	
	@BeforeSuite
	public void suite() {
		System.out.println("Before suite in day2 class");
	}
	@Test
	public void Login2() {
		System.out.println("day2 method 2");
	}

}
