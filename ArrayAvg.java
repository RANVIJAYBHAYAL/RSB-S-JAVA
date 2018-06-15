import java.util.Scanner;
class ArrayAvg
{
 public static void main(String arg[])
 {
 int n,sum=0,avg;
  int []x;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array");
  n=sc.nextInt();
  x=new int[n];
  
  System.out.println("enter" +x.length+ "values");
			for(int i=0;i<x.length;i++)
			{
			x[i]=sc.nextInt();
			sum=sum+x[i];
			}
		System.out.println("sum="+sum);
		
		avg=sum/x.length;
		System.out.println("average="+avg);
}			
}			