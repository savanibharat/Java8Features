package com.example.java8.functionpackage;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

	public static void main(String[] args) {

		// t and u are parameter
		// r is result to be returned

		biFunctionDemo();
	}

	private static void biFunctionDemo() {
		BiFunction<String, String, String> stringPrint = (t, u) -> {
			return t + u;
		};

		Function<String, String> adderFunction2 = t -> t + " Function Interface";

		System.out.println(stringPrint.andThen(adderFunction2).apply("Bi","Function"));

	}
}