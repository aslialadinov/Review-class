package com.syntax.review5;

public class Task7 {
    public static void main(String[] args) {

         /*
        Write a java program to check whether a given number is prime or not?
        1. number >1
        2. numbers should be divisible only by itself and 1 only
             2(1,2), 3(1,3), 4(1,2,4), 5(1,5),
         */

        int given=10;//part 1
        boolean isPrime=true;//the beginning

        if(given>1) {//part 2
            for (int i = 2; i < given; i++) {//part 2

                if(given%i==0){//part 2
                    isPrime=false;// the body
                    break;
                }

            }
        }else{//part 3
            isPrime=false;//part 3
        }

        System.out.println("Given number "+given+" is Prime? "+isPrime);//the ending
    }
}
