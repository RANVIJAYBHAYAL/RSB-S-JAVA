import java.util.Scanner;
class pattern6
{
public static void main(String arg[])
{

int i,j,m,k;
for(i=1;i<=12;i++)
{
if(i<=6)
{
for(k=1;k<=i+4;k++)
System.out.print("*");
m=i;
for(j=1;j<=6-i;j++)
{
System.out.print(m);
m++;
}
System.out.println("");
}
else
{
for(k=1;k<=17-i;k++)
{
System.out.print("*");
}
m=13-i;
for(j=1;j<=i-7;j++)
{
System.out.print(m);
m++;
}
System.out.println("");

}
}
}
}
