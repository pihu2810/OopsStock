package com.bridgelabz;

public class AccountTest implements IAccountTest
{
	public void Account(double balance, double creditbalance , double debitbalance )
  {
		balance=balance+creditbalance;
	  System.out.println("Total amount after the credit is " +balance); 
	  
 
	  if(debitbalance>balance)
	  {
		
		  System.out.println("Debit amount exceeded account balance");
	  }
	  else {
		  balance=balance-debitbalance;
		  System.out.println("Total amount after the debit is " +balance);
	  } 
  
}
}