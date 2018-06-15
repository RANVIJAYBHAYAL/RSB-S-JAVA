import java.util.Scanner;
class prime
{
public static void main(String arg[])
{
Scanner kb=new Scanner(System.in);
int i,n;
System.out.println("enter a no.");
n=kb.nextInt();

		for(i=2;i<=n/2;i++)
		{
		if(n%i==0)
		{
		System.out.println("itis not prime number");
		break;
		}
		}
		if(i>n/2)
		System.out.println("it is prime number");
		}
		}