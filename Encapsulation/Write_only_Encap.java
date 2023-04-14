package Encapsulation;

public class Write_only_Encap {
	//we can Write only(only setter method)
	private String name;
	//setter method for name
	public void setName(String name) {
		this.name=name;
		}
	public static void main(String[] args) {
		Write_only_Encap obj= new Write_only_Encap();
		//we can not get the value,there is no get method
		//System.out.println("Name:"+obj.name);
		System.out.println(obj.name);
		}
	}
