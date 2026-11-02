/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */

public class Q4 {
    public static void main(String[] args) {
        int a = 15;
        int b = 28;
        int c = 20;

        if (a >= b && a >= c) {
            System.out.println("Biggest number is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Biggest number is " + b);
        } else {
            System.out.println("Biggest number is " + c);
        }
    }
}

