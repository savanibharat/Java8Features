package com.example.java8.functionpackage;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {

//		BiConsumer<Integer, Integer> multiplier = (t, u) -> {
//			System.out.println(t * u);
//		};
//		multiplier.accept(10, 20);
		biConsumerDemo();
	}

	private static void biConsumerDemo() {
		BiConsumer<Integer, Integer> multiplier = (t, u) -> {
			System.out.println("Multiplier "+(t * u));
		};

		BiConsumer<Integer, Integer> adder = (t, u) -> {
			System.out.println("Adder "+(t + u));
		};
		System.out.println("Multiplier then adder");
		multiplier.andThen(adder).accept(10, 7);
		System.out.println();
		System.out.println("Adder then multiplier");
		adder.andThen(multiplier).accept(10, 7);
	}
}
