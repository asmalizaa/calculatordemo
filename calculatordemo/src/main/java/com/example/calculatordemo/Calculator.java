package com.example.calculatordemo;

public class Calculator {

	private double num1, num2;

	public Calculator(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double calculate(String operation) {
		switch (operation) {
		case "add":
			return num1 + num2;
		case "sub":
			return num1 - num2;
		case "mul":
			return num1 * num2;
		case "div":
			return num1 / num2;
		}
		return 0.0;
	}
}
