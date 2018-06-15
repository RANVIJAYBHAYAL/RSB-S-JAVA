import java.util.Scanner;
class pattern4
{
public static void main(String arg[])
{

int i,j,m,k,l;
for(i=1;i<=5;i++)
{
for(k=1;k<=i-1;k++)
System.out.print(" ");
m=i;
for(j=1;j<=6-i;j++)
{
System.out.print(m);
m++;
}
m=m-2;
for(l=1;l<=5-i;l++)
{
System.out.print(m);
m--;
}
System.out.println("");
m++;
}
}
}
