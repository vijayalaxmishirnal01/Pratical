package Encapsulation;

class Movie{//encapsulated class
	//private data member
	private String movie_name;
	private String movie_starttime;
	private String movie_endtime;
	private float movie_ticketprice;
	//public getter and setter method
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_starttime() {
		return movie_starttime;
	}
	public void setMovie_starttime(String movie_starttime) {
		this.movie_starttime = movie_starttime;
	}
	public String getMovie_endtime() {
		return movie_endtime;
	}
	public void setMovie_endtime(String movie_endtime) {
		this.movie_endtime = movie_endtime;
	}
	public float getMovie_ticketprice() {
		return movie_ticketprice;
	}
	public void setMovie_ticketprice(float movie_ticketprice) {
		this.movie_ticketprice = movie_ticketprice;
	}
}
class Encap_Test2 {
	public static void main(String[] args) {
		Movie m=new Movie();//creating object of movie class
		//setting the values through setter method
		m.setMovie_name("KGF");
		m.setMovie_starttime("2:00 PM");
		m.setMovie_endtime("5:00 PM");
		m.setMovie_ticketprice(250);
		//getting the values through getter method
		System.out.println("Movie Name:"+m.getMovie_name());
		System.out.println("Movie Starttime:"+m.getMovie_starttime());
		System.out.println("Movie Endtime:"+m.getMovie_endtime());
		System.out.println("Movie Ticketprice:"+m.getMovie_ticketprice());
	}
}
