package com.syntax.review6;

public class MoreStringMethods {
    public static void main(String[] args) {

        String myString="Today is February 2";
        //Splits this string around matches of the regular expression.
        String[] strArray= myString.split(" ");

        for(String s:strArray){
            System.out.println(s);
        }

        System.out.println(" *********************************** ");

        System.out.println(myString);//Today is February 2


        String newStr=myString.substring(9);
        System.out.println(newStr);

        newStr=myString.substring(9,17);
        System.out.println(newStr);  //February

       int index= newStr.indexOf('b');
        System.out.println(index);

        String anotherStr="Today is thyrsday";

        index=anotherStr.indexOf("thyrsday");
        System.out.println("Index of thyrsday is = "+index);




    }
}
