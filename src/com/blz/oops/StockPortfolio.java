package com.blz.oops;

import java.util.LinkedList;
import java.util.Scanner;

public class StockPortfolio {

	static int noOfData;
	static String shareName;
	static int noOfShare;
	static int sharePrice;
	static LinkedList<Stock> myLinkedList = new LinkedList<Stock>();
	static int[] price = new int[10];

	public static void main(String[] args) {
		getData();
		totalValueOfStocks();
	}

	public static void getData() {
		int noOfData1;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many data you want to enter");
		noOfData = sc.nextInt();
		noOfData1 = noOfData;
		while (noOfData1 > 0) {
			System.out.println("Enter stock name:");
			shareName = sc.next();
			System.out.println("Enter number of shares:");
			noOfShare = sc.nextInt();
			System.out.println("Enter each individual share price:");
			sharePrice = sc.nextInt();
			myLinkedList.add(new Stock(shareName, noOfShare, sharePrice));
			price[i++] = sharePrice * noOfShare;
			noOfData1--;
		}

		System.out.println("Linked list:" + myLinkedList);

		for (int j = 0; j < myLinkedList.size(); j++) {
			System.out.println(myLinkedList.get(j));
		}
	}

	public static void totalValueOfStocks() {
		int sumOfShares = 0;
		for (int i = 0; i < noOfData; i++) {
			sumOfShares = sumOfShares + price[i];

		}
		System.out.println("Total Share Price: " + sumOfShares);

	}
}
