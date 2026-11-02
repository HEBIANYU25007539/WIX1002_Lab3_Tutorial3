/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
import java.util.Scanner;

public class Lab3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter coordinate point (x y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double distanceSq = x * x + y * y;
        double radiusSq = radius * radius;

        if (distanceSq <= radiusSq) {
            System.out.println("The point is inside the circle");
        } else {
            System.out.println("The point is outside the circle");
        }
        sc.close();
    }
}