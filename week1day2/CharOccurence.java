package week1.day2;

public class CharOccurence {

	public static void main(String[] args) {

		int count =0;
		String str = "Welcome to chennai";
		char charArry[] = str.toCharArray();
		
		for (int i = 0; i < charArry.length;i++) {
			if(charArry[i] == 'e') {
				count++;
			}
		}
		System.out.println(count);
	}

}
