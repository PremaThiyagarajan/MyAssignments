package week1.day2Assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		// with sort
		Arrays.sort(arr);// {11, 12, 13, 14,14, 15, 16, 17, 17, 18, 18, 19, 20}
		System.out.println("Duplicate values in Array are:");
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i] == arr[i + 1]) 
			{
				System.out.println(arr[i]);
			}

		}

	}
}
