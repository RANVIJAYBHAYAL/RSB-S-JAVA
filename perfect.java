import java.util.Scanner;
class perfect
{
public static void main(String arg[])
{
Scanner kb=new Scanner(System.in);
int i,n,f=0;
System.out.println("enter a no.");
n=kb.nextInt();

		for(i=1;i<=n/2;i++)
		{
		f=f+i;
		}
		if(f==n)
		{
		System.out.println("itis perfect number");
		}
		else
		System.out.println("itis not perfect number");
		
		}
		}