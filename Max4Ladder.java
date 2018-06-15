import java.util.Scanner;
class Max4Ladder
{	public static void main(String ...at)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a>b&&a>c&&a>d)
			System.out.println("Max is "+a);						
		else
			if(b>c&&b>d)
					System.out.println("Max is "+b);			
			else
				if(c>d)
					System.out.println("Max is "+c);			
				else
					System.out.println("Max is "+d);							
	}
}