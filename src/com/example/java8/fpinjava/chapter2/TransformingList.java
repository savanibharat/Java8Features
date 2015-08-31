package com.example.java8.fpinjava.chapter2;

import java.util.ArrayList;
import java.util.List;

public class TransformingList {

	public static void main(String[] args) {

		List<String> languages = populateDatabases();
		final List<String> capsLanguages = new ArrayList<String>();
		/*for (String language : languages) {
			capsLanguages.add(language.toUpperCase());
		}*/
		final List<String> newLanguagesList = new ArrayList<String>();
		languages.forEach(lan -> newLanguagesList.add(lan.toUpperCase()));
		System.out.println(newLanguagesList);
		//System.out.println(capsLanguages);
		languages.stream()
				 .map(lan -> lan.toUpperCase())
				 .forEach(lan -> System.out.println(lan));
	}

	public static List<String> populateDatabases() {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("C#");
		list.add(null);//null value in list
		list.add("MongoDB");
		list.add("Oracle");
		return list;
	}

}
