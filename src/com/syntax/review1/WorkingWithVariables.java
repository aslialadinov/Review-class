package com.syntax.review1;

import java.sql.SQLOutput;

public class WorkingWithVariables {
    public static void main(String[] args) {

        int number=10;

        //declare a variable
        int num;//declare of a variable happens only once
        num= 100;//initialize the variable
        num= 200;//reassign the value
        num= 2000;
        num= 5000;


        System.out.println(num);

        boolean hungry=false;
        hungry=true;

        String myString= "Hello";
        String name= "Asli";
        String address= "123 Test Drive";

        System.out.println(myString +" " +name);
        int age=21;

        System.out.println(name + " is "+age+" year old");

        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);

        String month= "December";
        int day=14;

        System.out.println(month+" "+day);

        char date='1';
        System.out.println(date+month);

        System.out.println(date+day); //63





    }
}
