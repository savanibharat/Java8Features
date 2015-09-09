package com.example.java8.functionpackage;

import java.util.function.DoubleConsumer;

public class DoubleConsumerDemo {

	public static void main(String[] args) {

		DoubleConsumer power = (x) -> {
			double result = Math.pow(x, 2);
			System.out.println("Power Consumer " + result);
		};
		DoubleConsumer adder = (x) -> {
			x = x + 10;
			System.out.println("Adder Consumer " + x);
		};
		power.andThen(adder).accept(10);
	}
}
