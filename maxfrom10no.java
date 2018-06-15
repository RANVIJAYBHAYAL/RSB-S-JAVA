import java.util.Scanner;
class max10
{
public static void main(String arg[])
{
int i,value=0,max=0;
for(i=1;i<=10;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value=");
value=sc.nextInt();
if(value>max)
{
max=value;
}
}

System.out.println("maximum value from above 10 values is="+max);
}
} 