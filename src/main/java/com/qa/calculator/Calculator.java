package com.qa.calculator;

public class Calculator {

	public String add(int num1, int num2) {
		int number = num1 + num2;
		return "The result is " + number;
	}

	public String subtract(int num1, int num2) {
		int result = num1 - num2;
		return "The result is " + result;;
	}

}
