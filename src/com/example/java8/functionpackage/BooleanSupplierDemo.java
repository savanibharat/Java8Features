package com.example.java8.functionpackage;

import java.util.function.BooleanSupplier;

public class BooleanSupplierDemo {

	public static void main(String[] args) {

		BooleanSupplier bool = () -> false;
		System.out.println(bool.getAsBoolean());

		bool = () -> true;
		System.out.println(bool.getAsBoolean());

		String s1 = "ABC";
		String s2 = "ABC";
		BooleanSupplier stringEquals = () -> s1.equals(s2);
		System.out.println(stringEquals.getAsBoolean());
		
		int x = 10;
		int y = 20;
		BooleanSupplier intCompare = () -> x > y;
		System.out.println(intCompare.getAsBoolean());

	}

}
