public class calculator_main {
    public static void main(String[] args) {
        
        Calclator cal = new Calculator();
        System.out.println("Addition of number :"+cal.add(2,6,7));
        System.out.println("Subtraction of number :"+cal.sub(5,7));
        System.out.println("Multiplication of number :"+cal.mul(3,8));
        System.out.println("Division of number :"+cal.div(5,7));
    }
}