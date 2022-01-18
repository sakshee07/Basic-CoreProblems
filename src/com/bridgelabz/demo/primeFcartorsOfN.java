package com.bridgelabz.demo;
import java.util.*;
public class primeFcartorsOfN {

	public static void main(String[] args) {
int num,temp,i=2;
   Scanner sc = new Scanner(System.in);
	System.out.println("enter num : ");
	num = sc.nextInt();
	temp = num;
	System.out.println("prime factors : ");
	// calculating prime number temp= 20
	
	while(temp>1)
	{
		if(temp%i==0)
		{
			System.out.println(i+"");
			temp = temp/i;
			// avoid continuous loop
		}
		else { i++;
		}	
	}
	}
   
}


