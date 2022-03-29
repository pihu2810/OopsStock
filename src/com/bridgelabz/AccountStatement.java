package com.bridgelabz;

import java.util.Scanner;

public class AccountStatement 
{
  
public static void main(String args [])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the total balance =");
	  double balance=sc.nextDouble();
	  System.out.print("Enter the balance that is to be Debited = ");
	  double debitbalance=sc.nextDouble();
	  System.out.print("Enter the balance that is to be Credited = ");
	  double creditbalance=sc.nextDouble();
	  sc.close();
	  
	  IAccountTest accountTest = new AccountTest();
	  
	  accountTest.Account(balance, creditbalance, debitbalance);
  }
}
