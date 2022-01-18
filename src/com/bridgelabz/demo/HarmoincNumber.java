package com.bridgelabz.demo;

import java.util.Scanner;

public class HarmoincNumber {

	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.print("Series is : ");
		double ans = 0.0;
		while (num >0) {
		ans = ans + (double) 1/num;	
		num--;
		
		}
		
		System.out.println("");
		System.out.println( "Output for harmoic is "+ ans);
		


	}

}
///1 +1/2 +1/3