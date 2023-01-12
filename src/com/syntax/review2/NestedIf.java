package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        /* nested if is 1 is statement inside another if statement
        when we have 1 condition that depends on another

        */

        boolean vaccine =true;
        int dose =2;

        if(vaccine){
            System.out.println("How many doses you have");

            if (dose==1){
                System.out.println("You need second shot");
            } else {
                System.out.println("You are fully vaccinated");
            }
        }else {
            System.out.println("I do not have a vaccine");
        }

    }
}
