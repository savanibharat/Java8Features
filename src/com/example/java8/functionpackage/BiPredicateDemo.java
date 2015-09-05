package com.example.java8.functionpackage;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		orDemo();

		/*
		 * BiPredicate<Integer, Integer> biPredGreater = (t, u) -> t > u;
		 * System.out.println(biPredGreater.test(10, 9));
		 * 
		 * BiPredicate<String, String> biPredEquals = (t, u) -> t.equals(u);
		 * System.out.println(biPredEquals.test("Orion Pax", "Megatronus"));
		 */
	}

	private static void andDemo() {

		BiPredicate<String, String> biPredNotEquals = (t, u) -> !t.equals(u);

		BiPredicate<String, String> biPredLengthChecker = (t, u) -> t.length() > u
				.length();

		BiPredicate<String, String> biPred = biPredNotEquals
				.and(biPredLengthChecker);
		boolean test = biPred.test("AB", "AB");
		System.out.println(test);
		test = biPred.test("AB", "ABC");
		System.out.println(test);
		test = biPred.test("ABC", "AB");
		System.out.println(test);
	}

	private static void negateDemo() {

		BiPredicate<String, String> biPredEquals = (t, u) -> t.equals(u);
		System.out.println(biPredEquals.test("AA", "AA"));
		BiPredicate<String, String> biPredNegate = biPredEquals.negate();
		System.out.println(biPredNegate.test("AA", "AA"));
	}

	private static void orDemo() {

		BiPredicate<Integer, Integer> biPred1 = (t, u) -> t > 50 && u < 60;
		BiPredicate<Integer, Integer> biPred2 = (t, u) -> t > 55 && u < 65;
		BiPredicate<Integer, Integer> or = biPred1.or(biPred2);
		boolean test = or.test(40, 40);
		System.out.println(test);
		test = or.test(60, 55);
		System.out.println(test);
	}
}
