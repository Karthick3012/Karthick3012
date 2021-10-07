package week1.day2;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int arr[] = {100,49,398,34,1,267};
		int length = arr.length;
		System.out.println("Second smallest number :"+arr[length-3]);
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Second largest number :"+arr[length-2]);
	}
}
