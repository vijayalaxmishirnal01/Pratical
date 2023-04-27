package String;

public class StringFuncation {
	public static void main(String[] args) {
		
		//concept of string literal
		String name="Vijayalaxmi";
		String name1="Vijayalaxmi"; //It doesn't create a new instance
		//checking whether name and name1 is same the output will return true
		System.out.println(name==name1); //true
		
		System.out.println(name.indexOf('h')); //-1
		System.out.println(name.charAt(3)); //a
		
		String s="Welcome";
		System.out.println(name==s);
		
		String name2=new String("Vijayalaxmi");
		System.out.println(name==name2);
		System.out.println(name.equals(name2));
		
		//joining using concat function(explicitly)
		name=name.concat(" Shirnal");
		System.out.println(name);
		System.out.println("============================================");

		/*int a=20,b=0;
		System.out.println("Result: "+(a/b)); //ArithmeticException*/
		
		String s1 = "hello"; //104
		String s2 ="hello";	//104
		String s3 ="melon"; //109
		String s4 ="hen";   //106
		String s5 ="fish"; //102
		
		System.out.println(s1.compareTo(s2)); //0 104-104=0
		System.out.println(s1.compareTo(s3)); //-5 104-109=-5
		System.out.println(s1.compareTo(s4)); //-2 104-106=-2
		System.out.println(s1.compareTo(s5)); //2 104-102=2
		
		System.out.println(name.contains("ish"));
		System.out.println(name.contains("sha"));
		
		String w1 ="Welcome";
		String w2 ="Welcome";
		System.out.println(w1.equals(w2));
		System.out.println(w1.equalsIgnoreCase(w2));
		System.out.println("============================================");
		
		//String Buffer -modifiable
		StringBuffer buffer = new StringBuffer(""); //initial capacity 16
		System.out.println(buffer.capacity()); //16
		buffer.append("Hello Java");
		System.out.println(buffer);
		buffer.append(" Welcome to Anudip");
		System.out.println(buffer);
		System.out.println(buffer.capacity()); //(n*2)+2 = (16*2)+2=34
		buffer.insert(10, " World");
		System.out.println(buffer);
		System.out.println("============================================");
		
		//SubString is used in two ways
		//1)By giving the starting index and it will print rest of the String
		System.out.println(buffer.indexOf("Welcome"));
		System.out.println(buffer.substring(17));
		
		//2)by giving the start index and the end index -1
		System.out.println(buffer.indexOf("Java"));
		System.out.println(buffer.substring(6,10));
		
		buffer.delete(11, 16);
		System.out.println(buffer);
		System.out.println("-----------------");
		//String Builder -modifiable
		StringBuilder builder = new StringBuilder("Java 20");
		System.out.println(builder);
		System.out.println(builder.capacity()); //23
		builder.reverse();
		System.out.println(builder);
		builder.replace(3,7, "Python");
		System.out.println(builder);
		System.out.println("============================================");
	}
}