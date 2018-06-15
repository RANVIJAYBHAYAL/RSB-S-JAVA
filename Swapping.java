import java.util.Scanner;
class Swapping
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.print("enter value of a=");
a=sc.nextInt();
System.out.print("enter value of b=");
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping");
System.out.println("value of a=" +a);
System.out.print("value of b=" +b);
}
}