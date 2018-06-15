import java.util.Scanner;
class max4
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
if(a>b)
         {
           if(a>c)
          {
                           if (a>d)
                                          {
                                             System.out.println("a is max="+a);
                                             }
                                else
                                           {
                                            System.out.println("d is max="+d);
                                            }
           }
            
           

        else
      {
                                                       if(c>b)
                                                   {
                                                                 if(c>d)
                                                                             {
                                                                              System.out.println("c is max="+c);
                                                                               }
                                                                      else

                                                                             {
                                                                            System.out.println("d is max="+d);
                                                                              }
                                                           }  
                                                     else
                                                            {
                                                               System.out.println("b is max="+b);
                                                             }

           }
           } 


     
       else
                                                 {
                                                       if(b>c)
                                                                         {
                                                                             if(b>d)

                                                                                             {
                                                                                              System.out.println("b is max="+b);
                                                                                              }
                                                                                    else
                                                                                      {
                                                                                       System.out.println("d is max="+d);
                                                                                         }
                                                    }
    
                                else
                                           {
                                             System.out.println("c is max="+c);
                                           }
                                           }

}
}





