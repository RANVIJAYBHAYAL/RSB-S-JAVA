import java.util.Scanner;
class abcd
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,m;
System.out.println("CASE 1 FOR +,CASE 2ND FOR -,CASE 3RD FOR *,CASE 4TH FOR /");
System.out.println("enter value of a=");
int a=sc.nextInt();
System.out.println("enter operation=");
char c=sc.next().charAt(0);
System.out.println("enter value of b=");
int b=sc.nextInt();
System.out.println("enter value of n=");
n=sc.nextInt();
switch(n)
{
case 1:
                     m=a+b;
	System.out.println("a+b="+m);
                      break;
case 2:
                      m=a-b;
	System.out.println("a-b="+m);
                      break;
case 3: 
                      m=a*b;
	System.out.println("a*b="+m);
                      break;
case 4:          
                     m=a/b;
	System.out.println("a/b="+m);
                      break;

default:
	System.out.println("please enter valid symbol");
                      break;
}
}
}

