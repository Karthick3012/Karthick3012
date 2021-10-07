package week1day2;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$";
		int letter = 0, num = 0, space = 0, specialChar = 0;
		for(int i=0;i<test.length();i++) {
			if(Character.isLetter(test.charAt(i))) {
				letter=letter+1;
			}
			else if(Character.isDigit(test.charAt(i))) {
				num=num+1;
			}
			else if(Character.isSpace(test.charAt(i))) {
				space=space+1;
			}
			else {
				specialChar=specialChar+1;
			}
		}
		System.out.println("Letter :"+letter);
		System.out.println("Number :"+num);
		System.out.println("Space :"+space);
		System.out.println("SpecialCharacter :"+specialChar);
	}
}