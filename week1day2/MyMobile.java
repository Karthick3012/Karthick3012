package week1.day2;

public class MyMobile {
	
	String name ;
	int ram ;
	int Display ;
	String color ;
	
	public void makeCall() {
		System.out.println("This is calling method");
		
	}
	
	public void sendMail() {
		System.out.println("This is sending mail method");

	}
	
	private void payBills() {
		System.out.println("This is paybill private method");
	}

	public static void main(String[] args) {
		MyMobile obj = new MyMobile();
		obj.makeCall();
		obj.sendMail();
		

	}

}
