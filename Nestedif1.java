class Nestedif1{
public static void main(String args[])
{
String address="Solapur, India";
if(address.endsWith("India"))
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