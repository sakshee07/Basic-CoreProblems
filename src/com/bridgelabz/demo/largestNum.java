package com.bridgelabz.demo;
import java.util.Scanner;
public class largestNum {

	public static void main(String[] args) {
		
		int x;
		int y;
		int z;
		
Scanner sc = new Scanner(System.in);

System.out.println("Enter num1 : ");
x = sc.nextInt();

System.out.println("Enter num2 : ");
y = sc.nextInt();

System.out.println("Enter num3 : ");
z = sc.nextInt();


if (x > y && x > z) {
	System.out.println("x is Gretest among the numbers");}
else {
 System.out.println("X is not greatest among the numbers");
}
	}
}