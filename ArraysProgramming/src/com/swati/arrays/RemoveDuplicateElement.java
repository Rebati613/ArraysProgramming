package com.swati.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		Integer [] numbers = new Integer[] {1, 2, 5, 5, 6, 6, 7, 2};

		System.out.println("The array is :"+Arrays.toString(numbers));

		//create set from array elemennts
		HashSet<Integer> lhs = new HashSet<>(Arrays.asList(numbers));
		
		//Get back the array without duplicates
		Integer[] numbersWithoutDuplicates = lhs.toArray(new Integer[] {});
		
		System.out.println("The new array is :"+Arrays.toString(numbersWithoutDuplicates));

}
}
