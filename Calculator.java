class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args)
 {
        Calculator calc = new Calculator();

        int resultAdd = calc.add(10, 5);
        int resultSub = calc.subtract(10, 5);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSub);
    }
}