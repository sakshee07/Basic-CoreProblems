package com.bridgelabz.demo;
import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		System.out.println("Enter the year: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		
		if (( year % 400 == 0) || (year%4 == 0) && (year%100 != 0)) {
			System.out.println("This is leap year ! ");
		
		} else {
		System.out.println("This is not leap year !");	
		}
}
}