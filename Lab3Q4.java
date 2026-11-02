/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hebianyu
 */

import java.util.Random;

public class Lab3Q4 {
    public static void main(String[] args) {
        Random r = new Random();

        int dice1, dice2, dice3, dice4;
        int score1, score2;

        dice1 = r.nextInt(6) + 1;
        dice2 = r.nextInt(6) + 1;

        dice3 = r.nextInt(6) + 1;
        dice4 = r.nextInt(6) + 1;

        score1 = dice1 + dice2;
        score2 = dice3 + dice4;

        System.out.println("Player 1 dice: " + dice1 + " and " + dice2);
        System.out.println("Player 1 score: " + score1);

        System.out.println("Player 2 dice: " + dice3 + " and " + dice4);
        System.out.println("Player 2 score: " + score2);

        if (score1 > score2)
            System.out.println("Player 1 wins!");
        else if (score2 > score1)
            System.out.println("Player 2 wins!");
        else
            System.out.println("Draw!");
    }
}
