package myproject;

public class If_else {

	public static void main(String[] args) {
		
		int num =30;
		
		if(num%3 ==0 && num%5 ==0) {
			System.out.println("TRIZZ-FIZZ");
		}
		else if(num%3 ==0) {
			System.out.println("TRIZZ");
		}
		else{
			System.out.println("FIZZ");
		}

	}

}
