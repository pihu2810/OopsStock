package com.Bridgelabz;

import java.util.Scanner;

public class StockReport 
{
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("pLease enter the number of stock you will enter:");
		int numberOfStock=scanner.nextInt();
		IStockService istockService=new StockService();
		for(int i=0;i<numberOfStock;i++) {
			System.out.print("Please enter stock name");
			String stockName=scanner.next();
			System.out.print("Please enter stock share");
			int share=scanner.nextInt();
			System.out.print("Please enter stock share price");
			long sharePrice=scanner.nextLong();
			
			
			istockService.addstocks(stockName,share,sharePrice);
		}
		istockService.printReport();
		
		
	}

}
