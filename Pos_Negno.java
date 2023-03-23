import java.util.Scanner;
class Pos_Negno{
public static void main(String args[])
{
int n;
System.out.println("Enter a Number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n>0){
System.out.println("Number is Positive");
}
else if(n<0)
{
System.out.println("Number is Negative");
}
else
{
System.out.println(" ");
}
}
}