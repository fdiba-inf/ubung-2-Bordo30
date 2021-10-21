package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        System.out.println("Enter b: ");
        System.out.println("Enter c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(a != 0) {
            double discriminant = (b*b) - 4.0*(a*c);
            if (discriminant>=0) {
                double x1 = (-b+Math.sqrt(discriminant))/(2.0*a);
                double x2 = (-b-Math.sqrt(discriminant))/(2.0*a);
                System.out.println("x1 is: " + x1);
                System.out.println("x2 is: " + x2);
            } else {
                System.out.println("Imaginary values");
            }
        } else if(b != 0) {
            double x = c / b;
            System.out.println("x is: " + x);
        } else if(c != 0) {
            System.out.println("No values");
        } else {
            System.out.println("Many values");
        }
    }
}
