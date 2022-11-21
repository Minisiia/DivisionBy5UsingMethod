import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введіть перше число");
        int number1 = scanner.nextInt();
        System.out.println("Введіть друге число");
        int number2 = scanner.nextInt();
        System.out.println("Введіть третє число");
        int number3 = scanner.nextInt();

        calculator(number1, number2, number3);

    }

    static void calculator(int a, int b, int c) {
        double aDiv5 = (double) a / 5;
        double bDiv5 = (double) b / 5;
        double cDiv5 = (double) c / 5;
        System.out.println(a + " / 5 = " + aDiv5);
        System.out.println(b + " / 5 = " + bDiv5);
        System.out.println(c + " / 5 = " + cDiv5);
    }


}

