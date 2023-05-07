package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void Login() {
		System.out.println("day4 method 1");
	}
	@Test(groups= {"Smoke"})
	public void Login2() {
		System.out.println("day4 method 2");
	}
	@BeforeMethod()
	public void before() {
		System.out.println("Before method in day 4");
	}
	@Test
	public void Login3() {
		System.out.println("day4 method 3");
	}
}
