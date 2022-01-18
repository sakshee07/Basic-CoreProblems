package com.bridgelabz.demo;


import java.util.Scanner;

public class powerOf2 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	int a =2;//base
	int b =7 ;//exponent
	System.out.println("Enter base : ");
		a = scanner.nextInt();
		
	System.out.println("Enter exponent :  ");
	b = scanner.nextInt();
	
	for (b =1; b<=7; b++) {
		
	System.out.println("2^"+b+":"+(Math.pow(2, b)));
			
	scanner.close();
	}
	}
}
