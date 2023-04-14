package Encapsulation;

public class Read_only_Encap {
//we can read only(only getter method)
	private String name="Vijayalaxmi";
	//getter method for name
	public String getName(String name) {
		return name;
		}
	public static void main(String[] args) {
		Read_only_Encap obj= new Read_only_Encap();
		System.out.println(obj.name);
		}
	}
