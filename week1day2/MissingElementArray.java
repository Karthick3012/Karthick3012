package week1day2;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,7,8,9};
		int length=arr.length;
		int k;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				k=i+1;
				System.out.println(k);
				break;
			}
		}
	}
}