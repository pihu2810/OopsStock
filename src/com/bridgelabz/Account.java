package com.bridgelabz;

public class Account 
{
  private double balance;
  public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getcreditbalance() {
	return creditbalance;
}
public void setCreditbalance(double creditbalance) {
	this.creditbalance = creditbalance;
}
public Account(double balance, double creditbalance, double debitbalance) {
	super();
	this.balance = balance;
	this.creditbalance = creditbalance;
	this.debitbalance = debitbalance;
}
public double getDebitbalance() {
	return debitbalance;
}
public void setDebitbalance(double debitbalance) {
	this.debitbalance = debitbalance;
}
private double creditbalance;
  private double debitbalance;
}