package MyLovelyMath;

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

                int result = getFactorial.getFactorial(number);
                System.out.println("Fractal for " + number + " = " + result);
        } catch (StackOverflowError e) {
            System.out.println("Wow! Your number too huge or negative! Please, try again." +
                    "\n  Error Log: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Your number is fractional or contains letters or invalid characters. Please, try again." +
                    "\n  Error Log: " + e);
        } finally {
            userNumber.close();
        }
    }
    //      public int getFactorial(int number) {
//        int fact = 1;
//
//        for (int i = 2; i <= number; i++) {
//            fact = fact * i;
//        }
//        return fact;
//    }
    public int getFactorial(int number) {
        if (number == 0)
            return 1;
        else
            return (number * getFactorial(number - 1));
    }
}


