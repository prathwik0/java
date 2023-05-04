package bank;

import java.util.*;

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

public class BankAccount
{
   public static void main(String args[])
   {
       Scanner Sc = new Scanner(System.in);
       String name, type;
       long acc;
       double balance;
       
       System.out.print("Enter Name : ");
       name = Sc.nextLine();
       
       System.out.print("Enter Type : ");
       type = Sc.nextLine();
       
       System.out.print("Enter Account number : ");
       acc = Sc.nextLong();
       
       System.out.print("Enter Balance : ");
       balance = Sc.nextDouble();
       
       Bank bank = new Bank(name, acc, type, balance);
       bank.display();
       
       System.out.print("\nEnter amount to be deposited : ");
       double d = Sc.nextDouble();
       bank.deposit(d);
       bank.display();
       
       System.out.print("\nEnter amount to be withdrawn : ");
       double w = Sc.nextDouble();
       bank.withdraw(w);
       bank.display();
       
       Sc.close();
   }
}
