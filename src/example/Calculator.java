package example;

public class Calculator {
	private double num1;
	private double num2;
	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double add(double num1,double num2) {
		return num1+num2;
	}
	public double module(double num1,double num2) {
		return num1%num2;
	}
	public double division(double num1,double num2) {		
		return num1/num2;		
	}
	public String oddEven(double num) {
		if(num%2==0)return "Even";
		else return "Odd";
	}
	public double multiply(double num1,double num2) {		
		return num1*num2;		
	}

}
