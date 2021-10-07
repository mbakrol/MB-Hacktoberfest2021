package com.aman;

import java.util.Random;
import java.util.Scanner;

public class Rsp {
    public static void main(String[] args) {
        int i = 1;

        int Youwins = 0;
        int Computerwins = 0;
        while (i <= 5) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            System.out.println(" Enter 0,1,2 \n For Rock Enter:0  For Paper Enter:1  For Scissor Enter:2");
            int Input = sc.nextInt();
            System.out.println("Your Input:" + Input);
            int Automatic = rand.nextInt(3);
            System.out.println("Computer input:" + Automatic);
            if (Input == Automatic) {
                System.out.println("Match Draws");
            } else if ((Input == 0 && Automatic == 2) || (Input == 1 && Automatic == 0) || (Input == 2 && Automatic == 1)) {
                System.out.println("You wins");
                Youwins++;
            } else {
                System.out.println("Computer wins");
                Computerwins++;
            }
            i++;


        }
        System.out.println("Result:");
        if (Youwins > Computerwins){
            System.out.println("You are a winner");
        }
        else  if (Youwins < Computerwins){
            System.out.println("Sorry Better luck next time, Computer wins");
        }
        else {
            System.out.println("Match Draws");
        }
    }
}
