package com.syntax.review8;

public class InsuranceTest {
    public static void main(String[] args) {

        // can I create an object of Insurance class, no it is an abstract

        Insurance carPolicy=new CarPolicy("I544555","John Smith", 2000,22);

        carPolicy.getInsurance();
        System.out.println( carPolicy.calculateCoverage());

        Insurance petPolicy=new PetPolicy("P9987867", "Zvezda",45,20);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());

        Insurance [] insurance={
                new CarPolicy("P9987867", "Zvezda",45,20),
                new CarPolicy("P9987867", "Zvezda",45,20),
                new PetPolicy("P9987867", "Zvezda",45,20),
                new CarPolicy("P9987867", "Zvezda",45,20),
        };

       insurance[0].calculateCoverage();
    }
}
