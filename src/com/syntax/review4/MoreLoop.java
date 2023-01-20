package com.syntax.review4;

import java.util.Spliterator;

public class MoreLoop {
    public static void main(String[] args) {

        for (int i = 0; i <=3 ; i++) {
            System.out.println(i); //0 1 2 3

            for (int j = 1; j >=3; j++) {
                System.out.println(j);
            }
        }
        System.out.println("--------------------------");

        for (int i = 0; i <=3 ; i++) {


            for (int j = 1; j <=3; j++) {
                System.out.print(i+" ");
            }
        }

        System.out.println("---------CAR------------");

        for (int i = 0; i <=9; i++) {
            for (int j = 1; j <=9; j++) {
                for(int c=0; c<=9; c++) {
                    for(int d=0; d<=9; d++){
                        System.out.println(i+" "+j+" "+c+" "+d);
                    }
                }

            }
            System.out.println();
        }

    }
}
