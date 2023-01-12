package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        //when we have more conditions to test
        //if(boolean condition){

        int homeWork=30;
        if(homeWork>25){
            System.out.println("Great job");
        }else if (homeWork<25){
            System.out.println("Good job");
        }else if(homeWork>10){
            System.out.println("Ok job");
        }else if(homeWork>5){
            System.out.println("Not good job");
        }

        System.out.println("-------------------------------------------------  ");

        String browser= "chrome";

        if(browser.equals("chrome")){
            System.out.println("Test case executed on chrome browser");
        }else if (browser.equals("safari")){
            System.out.println("Test cases are executed on safari browser");
        }else if (browser.equals("firefox")){
            System.out.println("Test cases executed on firefox browser");
        }
// else condition will print if none of the conditions are true

    }
}
