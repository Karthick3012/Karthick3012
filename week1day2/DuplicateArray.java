package week1day2;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int num[] = {12,13,14,11,14,15,18,16,17,19,18,20};
		int length= num.length;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}
}