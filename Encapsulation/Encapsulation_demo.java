package Encapsulation;

class Java_Batch{ //encapsulation class
	//private data member
	private String name;
	private int batch_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
}
public class Encapsulation_demo {//main class
	public static void main(String[] args) {
		Java_Batch obj=new Java_Batch();
		obj.setName("**Solapur Batch**");
		obj.setBatch_id(4778);
		System.out.println(obj.getName()+" "+obj.getBatch_id());
	}
}
