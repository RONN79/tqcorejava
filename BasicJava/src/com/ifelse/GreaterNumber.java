package com.ifelse;

import java.util.Scanner;

public class GreaterNumber{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2");
		int num2 = sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Number 1 is great than number 2 ");
		}
		else
		{
			System.out.println("Number 2 is great than number 1 ");
		}
		sc.close();
	}
}
