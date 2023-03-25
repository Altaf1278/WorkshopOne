package com.bridgelabz.duplicateelements;

import java.util.Arrays;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		System.out.println("Welcome to remove duplicates in a sorted array");
		int number[] = { 1, 1, 2, 3, 4, 4, 9, 9, 12, 5, 6, 5, 15, 8, 7, 10, 10, 11 };
		System.out.println(" Removing Duplicate numbers of array: ");

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if ((number[i]) == (number[j])) {
					System.out.println(number[i]);
				}
			}
			
		}
		Arrays.sort(number);
		System.out.println("Arrays number in sorted format: " + Arrays.toString(number));
	}

}
