class Datatype
{
int i;
short s;
long l;
double d;
float f;
char c;
void show(){
System.out.println("int:" +i);
System.out.println("short:" +s);
System.out.println("long:" +l);
System.out.println("double:" +d);
System.out.println("float:" +f);
System.out.println("char" +c);
}
public static void main(String args[])
{
Datatype obj=new Datatype();
System.out.println("Default Value:");
obj.show();
}
}