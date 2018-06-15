import java.util.Scanner;
class bill
{
     public static void main(String arg[])
{
     Scanner sc=new Scanner(System.in);
     int pizzaQ,pepsiQ,pizzaR=90,pepsiR=85;
     float bill;
System.out.println("enter the quantity of pizza=");
pizzaQ=sc.nextInt();
System.out.println("enter the quantity of pepsi=");
pepsiQ=sc.nextInt();
        bill=(pepsiQ*pepsiR)+(pizzaQ*pizzaR);
        System.out.println("Bill="+bill);
}
}

