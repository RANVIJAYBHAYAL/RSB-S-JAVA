import java.util.Scanner;
class Odd_Even
{
	public static void main(String...x)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		System.out.println((a&1)==0?"Even ":"Odd SNo.");

	}
}