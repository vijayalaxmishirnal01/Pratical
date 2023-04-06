package assignment;

class Sports{//parent class
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in"+getName());
	}
}
class Football extends Sports{// child class
	@Override
	String getName() {
		return "Football class";
	}
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in"+getName());
	}
}
public class Egmethod_Overriding {
	public static void main(String[] args) {
		Sports s1=new Sports();
		Football s2=new Football();
		System.out.println(s1.getName());
		s1.getNumberOfTeamMembers();
		System.out.println(s2.getName());
		s2.getNumberOfTeamMembers();
	}
}