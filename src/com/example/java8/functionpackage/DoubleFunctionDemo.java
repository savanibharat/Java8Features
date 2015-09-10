package com.example.java8.functionpackage;

import java.util.function.DoubleFunction;

public class DoubleFunctionDemo {

	public static void main(String[] args) {

		DoubleFunction<String> doubleFunction = (x) -> String.valueOf(x)+" converted to String";
		String str = doubleFunction.apply(34d);

		System.out.println(str);
	}
}
