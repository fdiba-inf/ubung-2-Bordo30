package exercise2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number >= 0 && number <= 999) {
            double firstDigit = number % 10;
            number /= 10;
            double secondDigit = number % 10;
            number /= 10;
            double thirdDigit = number % 10;

            System.out.println("Sum of digits: " + (firstDigit+secondDigit+thirdDigit));
        }

    }
}
