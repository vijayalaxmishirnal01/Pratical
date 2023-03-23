import java.util.Scanner;
class Multi
{
public static void main(String args[])
{
int n;
System.out.println("Enter a year:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n*i);
}
}
}