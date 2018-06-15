import java.util.Scanner;
class Arraymaxmin
{
 public static void main(String arg[])
 {
 int n,max=0,min=0;
  int []x;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array");
  n=sc.nextInt();
  x=new int[n];
  
  System.out.println("enter" +x.length+ "values");
			for(int i=0;i<x.length;i++)
			{
			x[i]=sc.nextInt();
		     if(x[i]>max)
			 {
				 max=x[i];
			 }
			 else
			 {
              min=x[i];				 
			}
				 System.out.println("maximum no. is"+max);
			
			
		
		
}			
}			