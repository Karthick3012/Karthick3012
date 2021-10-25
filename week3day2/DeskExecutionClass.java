package week3day2;

public class DeskExecutionClass {

	public static void main(String[] args) {
		
		Dell obj = new Dell();
		int soft = obj.SoftwareResource();
		System.out.println("No of software installed is:"+soft);
		
		Dell obj1 = new Dell();
		float Model = obj1.desktopModelRAM();
		System.out.println("Model Number is:"+Model);
	}

}