package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {
        //widening
        double d=5;
        System.out.println(d); //5.0

        //narrowing
        int i=(int)5.0;
        System.out.println(i);//5
        int num=128;
        byte b=(byte)num;
        System.out.println(b);//-128


    }
}
