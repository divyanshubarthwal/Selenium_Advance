package JDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connecting_db_with_web {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/databasename");
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select* from credentials where scenario='zerobalance'");
		
		while(rs.next()) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com");
			
			
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys(rs.getString("username"));
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys(rs.getString("passowrd"));
	driver.quit();	
	}

	}}
