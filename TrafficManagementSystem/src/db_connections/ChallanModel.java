package db_connections;

import java.util.Date;

public class ChallanModel {
	private String vehicleno;
	private String Name;
	private String PhoneNumber;
	private Date date;
	private String Offense;
	private Double Fine;
	
	public Double getFine() {
		return Fine;
	}
	public String getName() {
		return Name;
	}
	public String getOffense() {
		return Offense;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public String getVehicleno() {
		return vehicleno;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setFine(Double fine) {
		Fine = fine;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setOffense(String offense) {
		Offense = offense;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	

}
