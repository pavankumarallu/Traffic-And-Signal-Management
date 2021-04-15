package db_connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Challan_db {
	static String url = "jdbc:mysql://localhost:3306/trafficmanagementsystem";
	static String username = "root";
	static String password = "pavan@123";
	Connection connection;
	public Challan_db() {
		// TODO Auto-generated constructor stub
		try {
			connection = DriverManager.getConnection(url,username,password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<ChallanModel> fetchOffenders()
	{
		ArrayList<ChallanModel> cm = new ArrayList<ChallanModel>();
		String query = "SELECT * FROM challandata";
		java.sql.Statement st;
		try {
			st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				ChallanModel am = new ChallanModel();
				am.setDate(rs.getDate("Date"));
				am.setVehicleno(rs.getString("vehicleno"));
				am.setName(rs.getString("Name"));
				am.setPhoneNumber(rs.getString("PhoneNumber"));
				am.setOffense(rs.getString("Offense"));
				am.setFine(rs.getDouble("Fine"));
				cm.add(am);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cm;
	}
	public ArrayList<ChallanModel> fetchEach(String Vehiname)
	{
		ArrayList<ChallanModel> cm = new ArrayList<ChallanModel>();
		String query = "SELECT * FROM challandata WHERE vehicleno = '"+Vehiname+"'";
		java.sql.Statement st;
		try {
			st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				ChallanModel am = new ChallanModel();
				am.setDate(rs.getDate("Date"));
				am.setVehicleno(rs.getString("vehicleno"));
				am.setName(rs.getString("Name"));
				am.setPhoneNumber(rs.getString("PhoneNumber"));
				am.setOffense(rs.getString("Offense"));
				am.setFine(rs.getDouble("Fine"));
				cm.add(am);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cm;
	}
	
	
	public void savedata(ChallanModel cm)
	{
		String query = "INSERT INTO challandata(vehicleno,Name,PhoneNumber,Date,Offense,Fine) VALUES(?,?,?,?,?,?)";
		PreparedStatement pa;
		Date date = new Date();
		java.sql.Date sqldate;
		sqldate = new java.sql.Date(date.getTime());
		try {
			pa = connection.prepareStatement(query);
			pa.setString(1,cm.getVehicleno());
			pa.setString(2, cm.getName());
			pa.setString(3, cm.getPhoneNumber());
			pa.setDate(4, sqldate);
			pa.setString(5, cm.getOffense());
			pa.setDouble(6, cm.getFine());
			pa.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

