package com.example.java8.functionpackage;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorDemo {

	public static void main(String[] args) {

		DoubleBinaryOperator doubleBinOp = (left, right) -> left * right;
		double result = doubleBinOp.applyAsDouble(1.5, 1.7);
		System.out.println(result);
	}
}
