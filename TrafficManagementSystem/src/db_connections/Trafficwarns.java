package db_connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Trafficwarns {
	static String url = "jdbc:mysql://localhost:3306/trafficmanagementsystem";
	static String username = "root";
	static String password = "pavan@123";
	Connection connection;
	public Trafficwarns() {
		// TODO Auto-generated constructor stub
		try {
			connection = DriverManager.getConnection(url,username,password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> gw(String vehicle) {
		
		// TODO Auto-generated method stub
		ArrayList<String> warnings = new ArrayList<String>();
		String query = "SELECT * FROM warnings WHERE vehiclename = '"+vehicle+"'";
		java.sql.Statement st;
		try {
			st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				warnings.add(rs.getString("warning"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return warnings;

	}
	
	public void sw(String vehicle,String warning)
	{
		String query = "INSERT INTO warnings(vehiclename,warning) VALUES(?,?)";
		PreparedStatement pa;
		
		try {
			pa = connection.prepareStatement(query);
			pa.setString(1, vehicle);
			pa.setString(2, warning);
			pa.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
