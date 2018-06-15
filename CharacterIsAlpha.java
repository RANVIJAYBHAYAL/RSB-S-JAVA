import java.util.Scanner;
class CharacterIsAlpha
{	public static void main(String ...at)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character ");
		char a=sc.next().charAt(0);		
		if(a>='A'&&a<='Z' || a>='a'&&a<='z')
		{	System.out.println(a+" is alphabet ");
		}
		else 
			if(a>=48&&a<=57)
			{	System.out.println(a+" is digit ");
			}
			else
			{	System.out.println(a+" is symbol ");
			}		
	}
}