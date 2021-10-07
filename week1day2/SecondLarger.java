package week1day2;

import java.util.Arrays;

public class SecondLarger {

	public static void main(String[] args) {
		
		int num[] = {3,2,11,4,6,7};
		int length = num.length;
		Arrays.sort(num);
		System.out.println("The second largestest number is :"+num[length-2]);
	}
}