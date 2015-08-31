package com.example.java8.fpinjava.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaHighOrderFunction {
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>(Arrays.asList("Robb","Ramsey","Ned","Sansa"));
		/*List<String> places=new ArrayList<String>(Arrays.asList("San Jose","Cupertino","Meeren"));
		List<String> companies=new ArrayList<String>(Arrays.asList("Paypal","Microsoft","Google"));
		*/
		/*final Function<Integer, Predicate<String>> lengthChecker = (Integer length) -> {
			Predicate<String> lengthCheck = str -> str.length() > length;
			return lengthCheck;
		};
		*/
		/*final Function<Integer, Predicate<String>> lengthChecker = (Integer length) -> {
			Predicate<String> lengthCheck = new Predicate<String>() {
				public boolean test(String str){
					return str.length() > length;
				}
			};
			return lengthCheck;
		};*/
		
		/*final Function<Integer, Predicate<String>> lengthChecker1 = new Function<Integer, Predicate<String>>() {

			@Override
			public Predicate<String> apply(Integer length) {
				Predicate<String> lengthCheck = new Predicate<String>() {
					public boolean test(String str) {
						return str.length() > length;
					}
				};
				return lengthCheck;
			}
		};*/
		
		Function<Integer, Predicate<String>> lengthChecker = 
							length -> str -> str.length() > length;		

		long namesCount = names.stream().filter(lengthChecker.apply(4)).count();

		System.out.println(namesCount);
	}
	
	/*public static Predicate<String> lengthChecker(int length){
		Predicate<String> predicate = str -> str.length() > length;
		return predicate;
	}*/
	
	/*public static Function<Integer, Predicate<String>> lengthCheckerFunction(){
		
		final Function<Integer, Predicate<String>> lengthChecker = 
				length -> str -> str.length() > length;
				return lengthChecker;
	}*/
}
