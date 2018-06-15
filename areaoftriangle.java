import java.util.Scanner;
class AreaOfTriangle
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int base,height;
float area;
System.out.println("enter value of base=");
base=sc.nextInt();
System.out.println("enter value of height=");
height=sc.nextInt();
area=0.5f*base*height;
System.out.println("area="+area);
}
}