import java.util.Scanner;
class Greatestno
{
public static void main(String args[])
{
int a,b,c;
Scanner s = new Scanner(System.in);
System.out.print("Enter the first number:");
a = s.nextInt();
System.out.print("Enter the second number:");
b = s.nextInt();
System.out.print("Enter the third number:");
c = s.nextInt();
if(a>b && a>c)
{
System.out.println(a+"greatest number is A.");
}
else if(b>c)
{
System.out.println(b+"greatest number is B.");
}
else
{
System.out.println(c+"greatest number is C.");
}}}