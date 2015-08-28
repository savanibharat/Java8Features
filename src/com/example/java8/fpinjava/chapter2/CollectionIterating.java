package com.example.java8.fpinjava.chapter2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CollectionIterating {

	public static void main(String[] args) {

		List<String> languages = populateLanguages();

		languages.forEach(System.out::println);
		/*
		 * collectionIterationJava8(languages); List<String> newLang =
		 * languages.stream() .map(language->language.toUpperCase())
		 * .collect(Collectors.toList()); System.out.println(newLang);
		 */
		List<String> newLang = languages.stream()
										.map(language -> language.toUpperCase())
										.collect(Collectors.toList());
		System.out.println(newLang);
	}

	public static List<String> populateDatabases() {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("C#");
		list.add("MySQL");
		list.add("MongoDB");
		list.add("Oracle");
		return list;
	}

	public static List<String> populateLanguages() {

		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("C#");
		languages.add("Python");

		return languages;
	}

	public static void collectionIterationJava8(List<String> languages) {
		/**
		 * languages is list with following values. [Java, JavaScript, C#,
		 * Python]
		 * */
		languages.forEach(new Consumer<String>() {
			public void accept(final String language) {
				System.out.println(language);
			}
		});
	}
}
