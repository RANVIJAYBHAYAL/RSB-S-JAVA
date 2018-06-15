import java.util.Scanner;
class EvenOrOdd
{
public static void main(String arg[])
{
Scanner sc =new Scanner(System.in);
int n;
System.out.println("enter a number=");
n=sc.nextInt();
if((n & 1)==0)
                   {
                     System.out.println("number is even");
                    }
else
        {
           System.out.println("number is odd");
         }
}
}