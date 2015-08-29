package com.example.java8.fpinjava.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DuplicationInPredicate {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>(Arrays.asList("Robb","Ramsey","Ned","Sansa"));
		List<String> places=new ArrayList<String>(Arrays.asList("San Jose","Cupertino","Meeren"));
		List<String> companies=new ArrayList<String>(Arrays.asList("Paypal","Microsoft","Google"));
		
		/*Function<Integer, Predicate<String>> lengthChecker = (Integer length) -> {
			Predicate<String> lengthCheck = str -> str.length() > length;
			return lengthCheck;
		};*/
		
		long namesCount = names.stream()
								.filter(lengthChecker(4))
								.count();
						
		long placesCount = places.stream()
								 .filter(lengthChecker(6))
								 .count();

		long companiesCount = companies.stream()
									   .filter(lengthChecker(5))
									   .count();

		System.out.println("namesCount "+namesCount);
		System.out.println("placesCount "+placesCount);
		System.out.println("companiesCount "+companiesCount);
		
		Function<Integer, Predicate<String>> lengthChecker = 
						length -> str -> str.length() >= length;		
		
		//long namesCount = names.stream().filter(lengthCheckerFunction().apply(3)).count();
		
		//System.out.println(namesCount);
		//System.out.println(placesCount);
		//System.out.println(companiesCount);
	}
	
	public static Predicate<String> lengthChecker(int length){
		Predicate<String> predicate = str -> str.length() > length;
		return predicate;
	}
	
	public static Function<Integer, Predicate<String>> lengthCheckerFunction(){
		
		Function<Integer, Predicate<String>> lengthChecker = 
				length -> str -> str.length() > length;
				return lengthChecker;
	}
}
