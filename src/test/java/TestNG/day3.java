package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	@Test(dataProvider="getData")
	public void Mobile(String username,String password) {
		System.out.println("day3 Mobile ");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[3][2];
		
		data[0][0]="username 1";
		data[0][1]="password 1";
		
		data[1][0]="username 2";
		data[1][1]="password 2";
		
		data[2][0]="username 3";
		data[2][1]="password 3";
		
		return data;
	}
	

}
