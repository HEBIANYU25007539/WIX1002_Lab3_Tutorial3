/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */
import java.util.Scanner;

public class Lab3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter the operand: ");
        String opStr = sc.next();
        char op = opStr.charAt(0);

        if (op == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (op == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (op == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (op == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else if (op == '%') {
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        } else {
            System.out.println("Invalid operator");
        }
        sc.close();
    }
}