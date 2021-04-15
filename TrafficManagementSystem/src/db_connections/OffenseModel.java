package db_connections;

public class OffenseModel {
	private String offensename;
	private String offensetype;
	private double fine;
	
	public double getFine() {
		return fine;
	}
	public String getOffensename() {
		return offensename;
	}
	public String getOffensetype() {
		return offensetype;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	public void setOffensename(String offensename) {
		this.offensename = offensename;
	}
	public void setOffensetype(String offensetype) {
		this.offensetype = offensetype;
	}

}
