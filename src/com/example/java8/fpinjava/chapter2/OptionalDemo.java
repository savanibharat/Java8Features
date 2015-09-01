package com.example.java8.fpinjava.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		List<String> days = new ArrayList<String>(Arrays.asList("Monday",
				null, "Wednesday", "Thursday", "Friday", "Saturday",
				"Sunday"));
		String prefix = "Wed";
		
		List<String> words = new ArrayList<String>(Arrays.asList("Mobilize",
				"Diversity", "Nation", "Mobilizers", "Mobilization"));
		
		String suffix = "Wed";
		
		flatMapDemo(words, suffix);
		
		/*for (String day : days) {

			if(day!=null){
				if(day.startsWith("Wed")&& day.length()>5){
					String upper=day.toUpperCase();
					System.out.println(upper);
				}
			}
		}*/

		
		/*Optional<String> opt = days.stream()
				.filter(day -> day.startsWith(prefix)).findFirst();
		*/
		//find(days, prefix);
		
		//Optional<String> optional=Optional.of("Monday");
		//Optional<String> optional=Optional.ofNullable(null);
		//Optional<String> optional=Optional.empty();
	}
	
	public static void flatMapDemo(List<String> words, String suffix){
		
		Optional<String> found = words.stream()
									  .filter(word -> word.startsWith("Mob"))
									  .findFirst();
		
		final Optional<String> upperCase = found.flatMap(word -> Optional.of(word.toUpperCase()));
		upperCase.ifPresent(word -> System.out.println(word));
		
		Optional<String> bad = returnsOptional();
		
		//Optional<Optional<String>> bad1 = found.map(bad);
		
		
	}
	
	public static Optional<String> returnsOptional(){
		return Optional.<String>of("Value Present");
	}

	public static void find1(List<String> days, String prefix) {

		String found = null;

		for (String day : days) {
			if (day.startsWith(prefix)) {
				found = day;
				break;
			}
		}
		if (found != null) {
			System.out.println(found);
		} else {
			System.out.println("No Matches");
		}
	}
	
	public static void find(final List<String> days, final String prefix){

		final Optional<String> found=days.stream()
										 .filter(day -> day != null)
										 .filter(day -> day.startsWith(prefix))
										 .findFirst();
	
		//found.ifPresent();
		
		found.filter(day -> day.length() > 5)
			 .map(String::toUpperCase)
			 .ifPresent(System.out::print);
		
		/*System.out.println(found.orElseGet(() -> "Not Found"));
		
		if(found.isPresent()){
			System.out.println(found.get());
		}*/
		
		//found.ifPresent(day->System.out.println(day));
		
		
//		
//		String output=found.orElse("No Matches");
//		System.out.println(String.format("%s", output));
	}
	
	public static void filterDemo(final List<String> days, final String prefix){
		
		final Optional<String> found=days.stream()
				 .filter(day -> day.startsWith(prefix))
				 .findAny();
		
		System.out.println(found);
		final Optional<String> foundFilter = found.filter(day -> day.contains("day"));
		System.out.println(foundFilter);
		
		final Optional<String> notFoundFilter = found.filter(day -> day.contains("xyz"));
		System.out.println(notFoundFilter);
	}
	
	
}
