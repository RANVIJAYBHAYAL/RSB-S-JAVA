import java.util.Scanner;
class Ascending4
{	public static void main(String ...at)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a<b)
		{	if(a<c)
			{	if(a<d)
				{	if(b<c)
					{		if(b<d)
							{	if(c<d)
								{	System.out.print("Values in ascending order are");
									System.out.println(a+","+b+","+c+","+d);
								}
								else
								{	System.out.print("Values in ascending order are");
									System.out.println(a+","+b+","+d+","+c);
								}							
							}
							else
							{	if(c<d)
								{
									System.out.print("Values in ascending order are");
									System.out.println(a+","+d+","+b+","+c);			
								}
								else
								{
									System.out.print("Values in ascending order are");
									System.out.println(a+","+d+","+b+","+c);			
								}			
							}
					}
					else
					{
						if(c<d)
						{		if(b<d)
								{	System.out.print("Values in ascending order are");
									System.out.println(a+","+c+","+b+","+d);						
								}
								else
								{	System.out.print("Values in ascending order are");
									System.out.println(a+","+c+","+d+","+b);			
								}
						}
						else
						{
								if(b<d)
								{	System.out.print("Values in ascending order are");
									System.out.println(a+","+c+","+b+","+d);						
								}
								else
								{	System.out.print("Values in ascending order are");
									System.out.println(a+","+c+","+d+","+b);			
								}
						}
					}
				}
				else
				{	if(b<c)
					{System.out.print("Values in ascending order are");
						System.out.println(d+","+a+","+b+","+c);			
					}
					else
					{
						System.out.print("Values in ascending order are");
						System.out.println(d+","+a+","+c+","+b);			
					}
				}
			}
			else
			{	if(c<d)
				{	if(b<d)
					{	System.out.print("Values in ascending order are");
						System.out.println(c+","+a+","+b+","+d);						
					}
					else
					{	System.out.print("Values in ascending order are");
						System.out.println(c+","+a+","+d+","+b);			
					}
				}
				else
				{ 	if(b<d)
					{	System.out.print("Values in ascending order are");
						System.out.println(c+","+a+","+b+","+d);						
					}
					else
					{	System.out.print("Values in ascending order are");
						System.out.println(c+","+a+","+d+","+b);			
					}					
				}	
			}
		}
		else
		{	if(b<c)
			{	if(b<d)
				{	if(a<c)
					{	if(a<d)
						{	if(c<d)
							{	System.out.print("Values in ascending order are");
								System.out.println(b+","+a+","+c+","+d);			
							}
							else
							{	System.out.print("Values in ascending order are");
								System.out.println(b+","+a+","+d+","+c);			
							}
						}
						else
						{	if(c<d)
							{	System.out.print("Values in ascending order are");
								System.out.println(b+","+c+","+d+","+a);			
							}
							else
							{	System.out.print("Values in ascending order are");
								System.out.println(b+","+d+","+a+","+c);			
							}
						}
					}
					else
					{	if(c<d)
						{	System.out.print("Values in ascending order are");
							System.out.println(b+","+c+","+d+","+a);			
						}
						else
						{
							System.out.print("Values in ascending order are");
							System.out.println(b+","+d+","+c+","+a);			
						}
					}
				}
				else
				{
					if(c<a)
					{
						if(c<d)
						{
							System.out.print("Values in ascending order are");
							System.out.println(c+","+b+","+d+","+a);			
						}
						else
						{	System.out.print("Values in ascending order are");
							System.out.println(d+","+b+","+c+","+a);			
						}
					}
				}
			}
			else
			{	if(c<d)
				{	if(b<d)
					{	System.out.print("Values in ascending order are");
						System.out.println(c+","+b+","+d+","+a);			
					}
					else
					{
						System.out.print("Values in ascending order are");
						System.out.println(c+","+d+","+b+","+a);			
					}
				}
				else
				{
					if(b<d)
					{	System.out.print("Values in ascending order are");
						System.out.println(d+","+b+","+c+","+a);			
					}
					else
					{
						System.out.print("Values in ascending order are");
						System.out.println(d+","+c+","+b+","+a);			
					}
				}
			}
		}
	}
}