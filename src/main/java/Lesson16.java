import models.Calculator;

public class Lesson16 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.divide(5,0));
        System.out.println(calc.add(0,6));
    }
}
