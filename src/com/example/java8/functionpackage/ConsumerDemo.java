package com.example.java8.functionpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> upperCase = (str) -> System.out.println(str
				.toUpperCase());

		Consumer<String> lowerCase = (str) -> System.out.println(str
				.toLowerCase());

		upperCase.andThen(lowerCase).accept("AaBb");

		List<String> languages = new ArrayList<String>(Arrays.asList("Java",
				"JavaScript", "C#", "Python"));
		
		
		
	}
}
