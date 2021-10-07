package week1day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String word = "changeme";
		char ch;
		char ch1[]=word.toCharArray();
		int length = ch1.length;
		for(int i=0;i<length;i++) {
			if(i%2==0) {
				ch=Character.toUpperCase(ch1[i]);
				System.out.println(ch);
			}
			else
				System.out.println(ch1[i]);
		}
	}
}