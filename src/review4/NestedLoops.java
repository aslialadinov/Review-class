package com.syntax.review4;

public class NestedLoops {
    public static void main(String[] args) {

        // nested loops are loop inside another loop
        //inner loop will always depend on outer loop

        for (int i = 1; i <=3 ; i++) { // outer loop

            System.out.println("Asli "+i);
            for (int j = 1; j <=4 ; j++) { // inner loop

                System.out.println("Ibo "+j);
            }
        }
        System.out.println("-----------------------------");
        //outer loop controls inner loop
        for (int i = 1; i <5 ; i++) {
            System.out.println("Hello");

            for (int j = 1; j <=2 ; j++) { //inner
                System.out.println("Bye");
            }
        }
    }
}
