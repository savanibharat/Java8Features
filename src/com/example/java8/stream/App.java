package com.example.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class App {

	public static void main(String[] args) {

/*		BiFunction<Integer, String, Person> p = Person::new;
		Person person = p.apply(23, "John Doe");
*/		
		BiFunction<Integer, String, Person> p = Person::new;
		Person person = p.apply(23, "John Doe");

	/*	BiFunction<Integer, String, Person> p = (age, name) -> new Person(age, name);
		Person person = p.apply(23, "John Doe");


		List<String> names = new ArrayList<>(Arrays.asList("Harry", "John",
				"Kip", "Gunther"));
		List<Person> person = nameMapper(names, Person::new);
		System.out.println(person);
*/	}

	public static List<Person> nameMapper(List<String> names, Function<String, Person> func) {

		List<Person> person = new ArrayList<Person>();
		for (String name : names) {
			person.add(func.apply(name));
		}
		return person;
	}
}
