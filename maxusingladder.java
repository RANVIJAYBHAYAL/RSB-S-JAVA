import java.util.Scanner;
class ladmax4
{
	public static void main(String arg[])                    
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("enter value of a=");
		a=sc.nextInt();
		System.out.println("enter value of b=");	
		b=sc.nextInt();
		System.out.println("enter value of c=");
		c=sc.nextInt();
		System.out.println("enter value of d=");
		d=sc.nextInt();
		if(a>b&&a>c&&a>d)
		{
 		
			System.out.println("a is max="+a);
		}
			else 
        				if(b>a&&b>c&&b>d)
				{
					System.out.println("b is max="+b);
				}
			else 
        				if(c>a&&c>b&&c>d)
				{
					System.out.println("c is max="+c);
				}
			else 
       	 			if(d>a&&d>b&&d>c)
				{
					System.out.println("d is max="+d);
				}
			else
			{
				System.out.println("all are equal");
			}
	}
}
