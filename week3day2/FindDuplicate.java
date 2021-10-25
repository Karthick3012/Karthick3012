package week3day2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int nums[] = {10,24,32,64,85,37,12,10};
		Set<Integer> unique = new HashSet<Integer>();
		boolean bDuplicates = false;
		for (int i = 0; i < nums.length; i++) {
			if (!unique.add(nums[i])) {
				System.out.println("Duplicate value is:"+nums[i]);
				bDuplicates = true;
				break;
			}
			
		}
		if (!bDuplicates) {
			System.out.println("All values are unique");
		}

	}

}
