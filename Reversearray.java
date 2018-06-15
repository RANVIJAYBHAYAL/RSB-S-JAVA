import java.util.Scanner;
class Arrayrev
{
 public static void main(String arg[])
 {
 int n;
  int []x;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array");
  n=sc.nextInt();
  x=new int[n];
  
  System.out.println("enter" +x.length+ "values");
			for(int i=0;i<x.length;i++)
			x[i]=sc.nextInt();

  System.out.println("reverse values are");
			for(int i=n-1;i>=0;i--)
			System.out.println(x[i]);
}
}			