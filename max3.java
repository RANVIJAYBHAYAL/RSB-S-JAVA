import java.util.Scanner;
class max3
{
public static void main(String arg[])
{
Scanner keyboard=new Scanner(System.in);
int a,b,c,m;
System.out.println("enter first no.");
a=keyboard.nextInt();
System.out.println("enter second no.");
b=keyboard.nextInt();
System.out.println("enter third no.");
c=keyboard.nextInt();
m=a>b?a:b;
m=m>c?m:c;
System.out.println("max no is"+m);
}
}
