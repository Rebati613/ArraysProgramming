package com.swati.arrays;

import java.util.HashSet;

public class SumOfUniqueElements {

	public static void sumOfUniqueHashset(int [] arr) {
		
		HashSet<Integer> hs = new HashSet<>();
		int sum = 0;
		for(int i = 0;i <  arr.length;i++) {
			if(!hs.contains(arr[i])) {
				sum += arr[i];
				hs.add(arr[i]);
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int [] arr = new int[] {1, 6, 4, 3, 2, 2, 3, 8, 1};
		
		sumOfUniqueHashset(arr);

	}

}
