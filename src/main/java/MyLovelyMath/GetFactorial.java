package MyLovelyMath;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetFactorial {

    public static void main(String[] args) {
        GetFactorial getFactorial = new GetFactorial();

        Scanner userNumber = new Scanner(System.in);
        System.out.println("Hi! I can count a factorial of your number. " +
                "\nType your number: ");
        try {
            int number = userNumber.nextInt();
            if (number < 0 || number >= 20) {
                System.out.println("Number should be more 0 and less 20. Please, try again.");
            } else {
                int result = getFactorial.getFactorial(number);
                System.out.println("Fractal for " + number + " = " + result);
            }
        } catch (
                InputMismatchException e) {
            System.out.println("Your number is fractional or contains letters or invalid characters. Please, try again." +
                        "\n  Error Log: " + e );
        } finally {
            userNumber.close();
        }
    }

    public int getFactorial(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}


