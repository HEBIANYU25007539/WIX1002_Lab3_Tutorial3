/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */

import java.util.Scanner;

public class Lab3Q3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        double sales, commission;

        System.out.print("Enter sales volume: ");
        sales = k.nextDouble();

        if (sales <= 100)
            commission = sales * 0.05;
        else if (sales <= 500)
            commission = sales * 0.075;
        else if (sales <= 1000)
            commission = sales * 0.10;
        else
            commission = sales * 0.125;

        System.out.printf("Commission = %.2f%n", commission);
    }
}
