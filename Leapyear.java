import java.util.Scanner;
class Leapyear
{
public static void main(String args[])
{
int n;
System.out.println("Enter a year:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%4==0)
{
System.out.println("leap year");
}
else
{
System.out.println("not leap year");
}
}
}