package batchapplication;

public class Java1 {

	private int stdid;
	private String stdName;
	private long phone;
	private String email;
	
	
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	//parameterized constructor
	public Java1(int stdid, String stdName, long phone, String email) {
		super();
		this.stdid = stdid;
		this.stdName = stdName;
		this.phone = phone;
		this.email = email;
	}
	//no-args constructor
		public Java1() {
			super();
			
		}
}
