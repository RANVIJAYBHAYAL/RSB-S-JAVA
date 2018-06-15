import java.util.Scanner;
class countPN
{
 public static void main(String arg[])
 {
 int n,positive=0,negative=0,zero=0;
  int []x;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array");
  n=sc.nextInt();
  x=new int[n];
  
  System.out.println("enter" +x.length+ "values");
			for(int i=0;i<x.length;i++)
			{
			x[i]=sc.nextInt();
			if(x[i]>0)
			positive++;
			else
			if(x[i]<0)	
            negative++;
		     else
			 zero++;
            }
			System.out.println("no. of positive="+positive);
            System.out.println("no. of negative="+negative);
			System.out.println("no. of zero="+zero);
}
}			