/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */

import java.util.Scanner;

public class Lab3Q5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        double a, b, c, d, e, f;
        double x, y, denominator;

        System.out.print("Enter a, b, c, d, e, f: ");

        a = k.nextDouble();
        b = k.nextDouble();
        c = k.nextDouble();
        d = k.nextDouble();
        e = k.nextDouble();
        f = k.nextDouble();

        denominator = a * d - b * c;

        if (denominator == 0)
            System.out.println("The equation has no solution");
        else {
            x = (e * d - b * f) / denominator;
            y = (a * f - e * c) / denominator;

            System.out.printf("x = %.2f%n", x);
            System.out.printf("y = %.2f%n", y);
        }
    }
}
