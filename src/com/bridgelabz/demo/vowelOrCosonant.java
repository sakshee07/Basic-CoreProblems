package com.bridgelabz.demo;
import java.util.Scanner;

public class vowelOrCosonant {
 public static void main(String[] args)
{
	String alphabate;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter alphabet: ");
	 String a= sc.next();

		if (a== "a" || a ==" i" || a == "o") {
			System.out.println("it is vowel");
		}	else {
		System.out.println("it is consonant");
		}

}
}