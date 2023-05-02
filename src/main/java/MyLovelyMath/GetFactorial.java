package MyLovelyMath;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetFactorial {

    public static void main(String[] args) {
        GetFactorial getFactorial = new GetFactorial();

        Scanner userNumber = new Scanner(System.in);
        System.out.println("Hi! I can count a factorial of your number. " +
                "\nType your number: ");
        String input = userNumber.nextLine();
        try {

            int number = Integer.parseInt(input);

            if (number < 0 ) {
                System.out.println("Number should be more 0. Please, try again.");
           } else {
                int result = getFactorial.getFactorial(number);
                System.out.println("Fractal for " + number + " = " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong. I wish I knew what exactly. Please, try again." +
                        "\n  Error Log: " + e );
        } catch (NumberFormatException e) {
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


