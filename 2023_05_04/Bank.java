package bank;

class Bank
{
   String name, type;
   long account_number;
   double balance_amount;
   
   //Constructor
   Bank(String n, long a, String t, double b)
   {
       name = n;
       account_number = a;
       type = t;
       balance_amount = b;
   }

   void deposit(double d)
   {
       if(d > 0)
       {
           balance_amount = balance_amount + d;
       }
       else
       {
           System.out.println("Invalid Amount");
       }
   }

   void withdraw(double w)
   {
       if(w > 0 && w <= balance_amount)
       {
           balance_amount = balance_amount - w;
       }
       else
       {
           System.out.println("Invalid Amount");
       }
   }

   void display()
   {
       System.out.println("\nName : " + name);
       System.out.println("Balance : " + balance_amount);
   }
}
