package week1.day2Assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 
		 * 2) Pick the 2nd element
		 * from the last and print it
		 */
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);//{2,3,4,6,7,11}
		int n = data.length;
		System.out.println("second largest number in Array is " + data[n - 2]);

	}

}
