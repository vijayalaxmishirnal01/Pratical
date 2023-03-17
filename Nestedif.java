class Nestedif{
public static void main(String args[])
{
String address="Solapur, India";
if(address.endsWith("Solapur"))
{
if(address.contains("Pune")){
System.out.println("city is Pune");
}
if(address.contains("Mumbai")){
System.out.println("city is Mumbai");
}
else{
System.out.println(address.split(",")[0]);
}
}
else{
System.out.println("You are not Living is India");
}
}
}