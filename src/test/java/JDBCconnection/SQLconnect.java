package JDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLconnect {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Adding selenium server standalone and mysql connection java jar
		
		String host="localhost";
		String port="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/databasename");
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select* from credentials where scenario='zerobalance'");
		
		while(rs.next()) {
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		}
		
	}

}
