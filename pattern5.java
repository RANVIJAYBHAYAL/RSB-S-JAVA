import java.util.Scanner;
class pattern5
{
public static void main(String arg[])
{

int i,j,m,k,l;
for(i=1;i<=10;i++)
{
if(i<=5)
{
for(k=1;k<=i-1;k++)
System.out.print(" ");
m=1;
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
}
else
{
for(k=1;k<=10-i;k++)
{
System.out.print(" ");
}
m=1;
for(j=1;j<=i-5;j++)
{
System.out.print(m);
m++;
}
m=m-2;
for(l=1;l<=i-6;l++)
{
System.out.print(m);
m--;
}
System.out.println("");
}
}
}
}
