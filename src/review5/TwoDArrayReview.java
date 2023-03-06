package com.syntax.review5;

public class TwoDArrayReview {
    public static void main(String[] args) {

        int[][] array={
                {1,2,3},
                {11,12,13},
                {20,21,22}
        };
        //getting all values from2D array using regular for loop

        for (int row = 0; row < array.length; row++) { //outer loop iterates over rows

            for (int col = 0; col < array[row].length; col++) { // iterates over each column

                // I want to print values from odd rows

                if(row%2!=0){
                    System.out.print(array[row][col]+" ");
                }


            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
        

        //getting all values from 2D Array using enhaced for loop
        for(int[] arr:array){ //iterates over arrays

            for(int num:arr){// iterates over each element
                if(num%2==0){
                    System.out.print(num+" ");
                }

            }
            System.out.println();
        }














         int numberOfArrays=array.length;
        System.out.println(numberOfArrays);

        int numberOfElementsIn1Arrayarray=array[0].length;
        System.out.println(numberOfElementsIn1Arrayarray);

        //access 21
        System.out.println(array[2][1]);
    }
}
