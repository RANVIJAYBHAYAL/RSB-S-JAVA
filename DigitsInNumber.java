import java.util.Scanner;
class DigitsInNumber
{	public static void main(String ...at)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		int a=sc.nextInt();
		if(a/10==0)
		{	System.out.println(a+" is 1 digit number ");
		}
		else 
			if(a/100==0)
			{	System.out.println(a+" is 2 digit number ");
			}
			else
				if(a/1000==0)
				{	System.out.println(a+" is 3 digit number ");
				}
				else
					if(a/10000==0)
					{	System.out.println(a+" is 4 digit number ");
					}
					else
					{	System.out.println(a+" more than 4 digit number ");
					}		
	}
}