import java.util.Scanner;
class Swap
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b,n=0;
System.out.println("enter value of a");
a=sc.nextInt();
System.out.println("enter value of b");
b=sc.nextInt();
n=a;
a=b;
b=n;
System.out.println("after swapping");
System.out.println("value of a=" +a);
System.out.println("value of b=" +b);
}
}
