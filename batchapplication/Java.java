package batchapplication;

public class Java {

	private int stdid;
	private String stdName;
	private String email;
	private long phone;
	
	//getter and setter methods
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	//parameterized constructor
	public Java(int stdid, String stdName, String email, long phone) {
		super();
		this.stdid = stdid;
		this.stdName = stdName;
		this.email = email;
		this.phone = phone;
	}
	
	//no-args constructor
	public Java() {
		super();
		
	}
	
	
}
