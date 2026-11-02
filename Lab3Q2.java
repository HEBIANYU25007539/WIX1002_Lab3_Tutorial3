/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */

import java.util.Random;

public class Lab3Q2 {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(6);

        if (num == 0)
            System.out.println("0 is zero.");
        else if (num == 1)
            System.out.println("1 is one.");
        else if (num == 2)
            System.out.println("2 is two.");
        else if (num == 3)
            System.out.println("3 is three.");
        else if (num == 4)
            System.out.println("4 is four.");
        else
            System.out.println("5 is five.");
    }
}

