package com.syntax.review8;

import com.syntax.review7.Car;
import com.syntax.review7.Tesla;

public class CarTest {
    public static void main(String[] args) {

        Bmw bmw=new Bmw("Bmw","X7");
        bmw.start();
        System.out.println(bmw.drive("Smooth"));
        bmw.brake();

       Car car=new Car("SomeCar","SomeModel");
       car.start();
       car.drive(90);

       Tesla tesla=new Tesla("Tesla","S", 2022,300,"electric",true);
       tesla.start(); // overrided method from tesla class is executed
       tesla.drive(75); //comes from Parent class
       tesla.haveAutopilot();//comes from Tesla class


        //Runtime polymorphism achieved through method overriding
        // casting: widening and narrowing - used with primitives
        //          upcasting and down-casting - use with non primitives
        Car bmw1=new Bmw("Bmw","X77"); // upcasting

        bmw1.start();
        bmw1.drive(100);
        bmw1.drive("Miami",120);


    }
}
