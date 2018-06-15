import java.util.Scanner;
class avg10
{
public static void main(String arg[])
{
int i,value=0,avg=0,sum=0;
for(i=1;i<=10;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value=");
value=sc.nextInt();
sum=value+sum;
}
avg=sum/10;
System.out.println("average of above 10 values is="+avg);
}
} 