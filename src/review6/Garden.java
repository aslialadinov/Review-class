package com.syntax.review6;

public class Garden {

    void hello(){
        String name="Adem";
        System.out.println("Hello "+name); //local variable
    }
    public static void main(String[] args) {

        // static  String str; error local variable can not be static
       // System.out.println(name); error :since local variable is not visible outside of code


        //accessing variables of Flowers class
        Flower flower1=new Flower();
        System.out.println(Flower.pretty);//correct way accessing static
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false;//not right way to access static variable but it is possible
        System.out.println("Hibiscus pretty? "+flower1.pretty);
        System.out.println(flower1.pretty);
        System.out.println(flower1.price);
       // flower1.size= error since variable size does not exist in Flower class

        //accessing methods of Flowers class
        flower1.bloom();
        flower1.grow();
        flower1.smell();


        System.out.println("Creating second object of the class Flower");
        Flower flower2= new Flower();
        System.out.println("Roses are pretty? "+flower2.pretty);
        flower2.name="Roses";
        flower2.color="blue";
        flower2.price=15;
        flower2.price=18;

        System.out.println(flower2.price);

        flower2.bloom();
        flower2.grow();
        flower2.smell();
        //flower2.stinks error -since method is not declared in Flower class

        Flower flower3= new Flower();

         //variable i- local to its block of code -loop
        for (int i = 1; i <=3; i++) {
            System.out.println(i);
        }

       // System.out.println(i); error since i is not visible outside of loop{}

    }
}
