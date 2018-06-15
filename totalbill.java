import java.util.Scanner;
class bill
{
     public static void main(String arg[])
{
     Scanner sc=new Scanner(System.in);
     int pizzaQ,pepsiQ,pizzaR=90,pepsiR=85;
     float bill;
     double cgstB,sgstB,scB,TotalBill;
System.out.println("enter the quantity of pizza=");
pizzaQ=sc.nextInt();
System.out.println("enter the quantity of pepsi=");
pepsiQ=sc.nextInt();
        bill=(pepsiQ*pepsiR)+(pizzaQ*pizzaR);
        System.out.println("Bill="+bill);

System.out.println("bill when 9 percent cgst is applied");
         cgstB=0.09*bill;
System.out.println("cgst bill="+cgstB);

System.out.println("bill when 9 percent sgst is applied");
         sgstB=0.09*bill;
System.out.println("sgst bill="+sgstB);
 
System.out.println("bill when 6 percent service charge is applied");
         scB=0.06*bill;
System.out.println("scBbill="+scB);
 
TotalBill=bill+cgstB+sgstB+scB;
System.out.println("total bill to be paid="+TotalBill);

}
}

