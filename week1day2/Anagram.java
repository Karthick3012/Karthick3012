package week1day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1="stops";
		String text2="potss";
		boolean status;
		int length=text1.length();
		int length1=text2.length();
		if(text1.length()==text2.length()) {
			char[] chArr=text1.toCharArray();
			char[] chArr1=text2.toCharArray();
		     Arrays.sort(chArr);
			Arrays.sort(chArr1);
			status= Arrays.equals(chArr,chArr1);
			 if(status==true)
			{
				System.out.println("Both the Array are same so the word is Anagram");
			}
			else
			{
				System.out.println("Both the Arrays are different so the word is not Anagram");
			}
			
		}

	}
}