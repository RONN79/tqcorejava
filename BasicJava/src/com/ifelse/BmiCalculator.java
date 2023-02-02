package com.ifelse;
import java.util.Scanner;
public class BmiCalculator {

	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your weight in kilogram: ");
	 float weight = sc.nextFloat();
	 System.out.println("Enter your height in feet: ");
	 float height = sc.nextFloat();
	 height = height*0.3048f;
	 float bmi = weight / (height * height);
	 System.out.println("The BMI is " + bmi + "kg/m2");
	 
	 if(bmi<18)
	 {
		System.out.println("You are underweight");	 
	 }
	 else if(bmi>=18 && bmi<=25)
	 {
		System.out.println("You are normal");	 
	 }
	 else
	 {
		 System.out.println("You are overweight");
	 }
	 
	 sc.close();
	}
}
