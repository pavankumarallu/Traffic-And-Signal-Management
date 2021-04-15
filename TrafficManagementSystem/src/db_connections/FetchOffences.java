package db_connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FetchOffences {
	static String url = "jdbc:mysql://localhost:3306/trafficmanagementsystem";
	static String username = "root";
	static String password = "pavan@123";
	Connection connection;
	public FetchOffences() {
		// TODO Auto-generated constructor stub
		try {
			connection = DriverManager.getConnection(url,username,password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<OffenseModel> fetchall() {
		ArrayList<OffenseModel> off = new ArrayList<OffenseModel>();
		String query = "SELECT * from offences";
		java.sql.Statement st;
		try {
			st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				OffenseModel am = new OffenseModel();
				am.setOffensename(rs.getString("offenseName"));
				am.setFine(rs.getDouble("fine"));
				am.setOffensetype(rs.getString("offenseType"));
				off.add(am);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return off;
		
	}
	public double getFine(String offense) {
		// TODO Auto-generated method stub
		double fine = 0;
		String query = "SELECT * from offences WHERE offenseName = '"+offense+"'";
		java.sql.Statement st;
		try {
			st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				fine = rs.getDouble("fine");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fine;
		

	}
	public ArrayList<OffenseModel> fettype(String type) {
		ArrayList<OffenseModel> off = new ArrayList<OffenseModel>();
		String query = "SELECT * from offences where offenseType = '"+type+"'";
		java.sql.Statement st;
		try {
			st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				OffenseModel am = new OffenseModel();
				am.setOffensename(rs.getString("offenseName"));
				am.setFine(rs.getDouble("fine"));
				am.setOffensetype(rs.getString("offenseType"));
				off.add(am);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return off;
		
	}
	
		
}
