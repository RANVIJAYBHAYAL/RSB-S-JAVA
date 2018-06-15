import java.util.Scanner;
class countPrime
{
 public static void main(String arg[])
 {
 int n,prime=0,nonprime=0,flag;
  int []x;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array");
  n=sc.nextInt();
  x=new int[n];
  
  System.out.println("enter" +x.length+ "values");
			for(int i=0;i<x.length;i++)
			{flag=1;
			x[i]=sc.nextInt();
		for(int j=2;j<x[i];j++)
		{
		if(x[i]%j==0)
		{flag=0;
		break;
		}
		}
		if(flag==1 && x[i]!=1)
		{
		System.out.println("prime values"+x[i]);
    	}
			}
		
		
		
}
}			