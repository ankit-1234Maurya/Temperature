import curpack.*;
import java.util.Scanner;
class CurrencyConv
{
  public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);
     int a,b;
     CurConv c=new CurConv();
     System.out.println("Enter money in doller");
     a=sc.nextInt();
     c.dtor(a);
     System.out.println("Enter money in rupees");
     b=sc.nextInt();
     c.rtod(b);
  }
}     