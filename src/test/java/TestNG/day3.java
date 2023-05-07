package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {

	@Test()
	public void MobileLogin() {
		System.out.println("day3 Mobile Login");
	}
	@Test(groups= {"Smoke"})
	public void MobileLogout() {
		System.out.println("day3 Mobile Logout");
	}
	@BeforeMethod
	public void before() {
		System.out.println("before method in day 3");
	}
	@Test
	public void Mobile() {
		System.out.println("day3 Mobile ");
	
}
}
