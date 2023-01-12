package com.syntax.review2;

public class IfElse {
    public static void main(String[] args) {

        /* if statement
        if (boolean condition) {
        }
        */
        int num=12;

        if(num>100){
            System.out.println(num+" is greater than a 100");
        }else {
            System.out.println(num+" is less than a 100");
        }

        String button="Enroll today";

        if(button.equals("Enroll today")){
            System.out.println("Tes Case Pass");
        }else {
            System.out.println("Test Case Failed");
        }

    }
}
