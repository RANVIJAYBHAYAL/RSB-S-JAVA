import java.util.Scanner;
class knumber
{
public static void main(String arg[])
{
Scanner kb=new Scanner(System.in);
int n,f,sum=0,i,m,t;
System.out.println("enter a no.");
n=kb.nextInt();
t=n;
		while(n!=0)
		{
		m=n%10;f=1;
		for(i=2;i<=m;i++)
		{
		f=f*i;
		}
		sum=sum+f;n/=10;
		}
		if(t==sum)
		System.out.println(t+"is k number");
		else
		System.out.println(t+"is not k number");
		}
		}