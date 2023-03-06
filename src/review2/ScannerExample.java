package com.syntax.review2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        int i =10;
      //Scanner i s non primitive variable =scanner
        Scanner keyBoard=new Scanner(System.in);

        System.out.println("Please enter your age");
        int age =keyBoard.nextInt();//to capture int

        System.out.println("Are you tired");
        boolean tired=keyBoard.nextBoolean();//to capture boolean values

        System.out.println("What is your name");
        String name=keyBoard.next();//to capture String until space

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);

    }
}
