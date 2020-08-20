package example;

import java.util.Scanner;

public class MathOpApp {
	
	/*
	 * This a math app that execute:
	 * Addition-Yes
	 * Multiplication-Yes
	 * Division-Yes
	 * module-Yes
	 * Division-Yes [handle zero division]
	 * module-Yes
	 * output if number is even or odd-Yes
	 */


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first num: ");
		double num1=scan.nextDouble();
		System.out.println("Enter second num: ");
		double num2=scan.nextDouble();
		
		
        Calculator cal=new Calculator(num1,num2);
		
		System.out.println("-------Operation result-------\n");
		
		System.out.println("sum: " + cal.add(num1, num2));		
		System.out.println("module  : " + cal.module(num1, num2));
		System.out.println("product : " + multiply(num1, num2));
		System.out.println("Number " + num1 + " is : " + oddEven(num1));
		
		
		if (num2 != 0) {
		System.out.println("division: " + division(num1, num2));
		System.out.println("Number " + num2 + " is : " + oddEven(num2));
		}
		else
		System.out.println("division: ERROR!");
		
	}

	private static String oddEven(double num1) {
		if(num1%2==0)
		return "Event";
		else
		return "Odd";
	}

	private static double mod(double num1, double num2) {
		return num1%num2;
	}

	private static double division(double num1, double num2) {
		return num1/num2;
	}

	private static double multiply(double num1, double num2) {
		return num1*num2;
	}

	private static double addition(double num1, double num2) {
		return num1+num2;
	}

}
