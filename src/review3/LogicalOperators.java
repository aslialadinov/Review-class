package com.syntax.review3;

import java.sql.SQLOutput;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean loginButtonDisplayed=true;

        boolean loginButtonClickable=true;

        if(loginButtonDisplayed && loginButtonClickable){
            System.out.println("Test case is passed");

        }else {
            System.out.println("Test case failed");
        }

        System.out.println("---------OR-------");

        boolean dashBoard=true;
        String message="Welcome admin";

        if(dashBoard || message.equals("Welcome admin")){
            System.out.println("User is logged in");
        }else{
            System.out.println("User is not logged in");
        }
        System.out.println("----------NOT-------------");
        boolean b=true;

        System.out.println(!true); // false

        boolean agreeCheckBoxSelected=true;

        if(!agreeCheckBoxSelected){
            System.out.println(" I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");


    }
}
