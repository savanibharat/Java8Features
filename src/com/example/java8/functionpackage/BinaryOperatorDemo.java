package com.example.java8.functionpackage;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {

		maxByDemo();
		/*BinaryOperator<Integer> biOp = (t, u) -> t + u;
		int result = biOp.apply(2, 3);
		System.out.println("apply() method "+result);

		BinaryOperator<Integer> biOpMin = BinaryOperator.minBy(Integer::compare);
		int min = biOpMin.apply(12, 33);
		System.out.println("minBy() "+min);
		
		biOpMin = BinaryOperator.minBy(Comparator.reverseOrder());
		min = biOpMin.apply(12, 33);
		System.out.println("minBy() "+min);*/
	}
	private static void maxByDemo(){
		BinaryOperator<Integer> biOpMax = BinaryOperator.maxBy(Integer::compare);
		int max = biOpMax.apply(12, 33);
		System.out.println("maxBy() "+max);
		
		biOpMax = BinaryOperator.maxBy(Comparator.reverseOrder());
		max = biOpMax.apply(12, 33);
		System.out.println("minBy() "+max);
	}
	
	
	
}
