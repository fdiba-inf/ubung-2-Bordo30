package exercise2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");

        int radius = input.nextInt();
        double circumference = 2.0*Math.PI*radius;
        double area = Math.PI*(radius*radius);

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
