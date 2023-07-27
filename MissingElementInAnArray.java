package week1.day2Assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
				int[] arr = {1,2,3,4,7,6,8};
				Arrays.sort(arr); //{1,2,3,4,missing num,6,7,8}
				for (int i=arr[0] ; i< arr.length;i++)
				{
					int j = arr[i - 1];
					if (i!=j) {
						System.out.println("Missing Number in Array is:" +i);
						break;
					}
				}

					
	}

}
