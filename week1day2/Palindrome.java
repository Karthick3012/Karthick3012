package week1day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		String value = "";
		char ch[] = str.toCharArray();
		int length = ch.length;
		for(int i=ch.length-1;i>=0;i--) {
			value = value+ch[i];
			System.out.println(value);
		}
		System.out.println(value);
		if(str.equals(value)) {
			System.out.println("The String is Palindrome :"+value);
		}
		else {
			System.out.println("The String is not a palindrome "+value);
		}
	}
}