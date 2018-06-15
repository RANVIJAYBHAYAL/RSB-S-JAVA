import java.util.Scanner;
class countOE
{
 public static void main(String arg[])
 {
 int n,odd=0,even=0;
  int []x;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array");
  n=sc.nextInt();
  x=new int[n];
  
  System.out.println("enter" +x.length+ "values");
			for(int i=0;i<x.length;i++)
			{
			x[i]=sc.nextInt();
			if(x[i]%2==0)
			even++;
			else
            odd++;
            }
			System.out.println("no. of even="+even);
            System.out.println("no. of odd="+odd);
}
}			