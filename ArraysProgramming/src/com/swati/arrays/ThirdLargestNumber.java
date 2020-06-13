package com.swati.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestNumber {

	public static int getThirdLargest(Integer [] arr , int total) {
		
		List<Integer> list = Arrays.asList(arr);
		
		Collections.sort(list);
		int element = list . get(total-3);
		return element;
	}
	
	public static void main(String[] args) {

		Integer [] arr = { 6, 8, 1, 9, 2, 1, 10};
		System.out.println("The array is :"+Arrays.toString(arr));
		System.out.println("Third larget number in given array is :"+getThirdLargest(arr, arr.length));

	}

}
