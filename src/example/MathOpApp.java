package example;

import java.util.Scanner;

public class MathOpApp {
	
	/*
	 * This a math app that execute:
	 * Addition-Yes
	 * Multiplication-No
	 * Devision-No
	 * module-No
	 * output if number is even or odd-No
	 */

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first num: ");
		double num1=scan.nextDouble();
		System.out.println("Enter second num: ");
		double num2=scan.nextDouble();
		
		System.out.println("-------Operation result-------\n");
		System.out.println("sum: " + addition(num1,num2));

	}

	private static double addition(double num1, double num2) {
		return num1+num2;
	}

}
