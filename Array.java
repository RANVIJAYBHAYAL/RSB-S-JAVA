import java.util.Scanner;
class Array
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

  System.out.println(+x.length+ "values are");
			for(int i=0;i<x.length;i++)
			System.out.println(x[i]);
}
}			