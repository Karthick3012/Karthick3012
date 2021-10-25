package week3day1;

public class Calculator {
	
	public void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public void subtract(int a, int b, int c) {
		int sum = a-b-c;
		System.out.println(sum);
	}
	public void subtract(int a, int b) {
		int sum = a-b;
		System.out.println(sum);
	}
	public void multiply(int a, int b, int c) {
		int sum = a*b*c;
		System.out.println(sum);
	}
	public void multiply(int a, int b) {
		int sum = a*b;
		System.out.println(sum);
	}
	public void division(int a, int b, int c) {
		int sum = a/b/c;
		System.out.println(sum);
	}
	public void division(int a, int b) {
		int sum = a/b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.add(12, 6);
		obj.add(23, 32, 11);
		obj.subtract(12, 3);
		obj.subtract(23, 20, 60);
		obj.multiply(33, 12);
		obj.multiply(3, 2, 5);
		obj.division(55, 2);
		obj.division(22, 2, 56);
	}

}