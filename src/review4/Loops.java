package com.syntax.review4;

import java.awt.image.BandCombineOp;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //while loop
        int a = 1;
        while (a <= 3) {
            System.out.println("I am a while loop");
            a++;
        }
        // when we do not know how many times we need to repeat block of code
        //while or do while
        int b = 1;
        do {
            System.out.println("do while");
            b++;
        } while (b >= 3);

        //Ask students if they understand loop ?
        // If do not tell them do more practice more loops
        // If they understand --> you good to move to array concept
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java?");
             answer = scan.nextLine();

        }while(!answer.equalsIgnoreCase("yes"));
        System.out.println(("Great job let's learn arrays"));
    }
}