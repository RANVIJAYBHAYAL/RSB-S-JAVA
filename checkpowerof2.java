import java.util.Scanner;
class powerof2
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter value of n");
n=sc.nextInt();
if((n&(n-1))==0)
System.out.println("number is power of 2");
else
System.out.println("not power of 2");
}
}