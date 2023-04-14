package com.syntax.review2;

public class IfStatment {
    public static void main(String[] args) {

        int age=18;

        if (age>=18) {
            System.out.println("You can get a DL");
        } else {
            System.out.println("You are too young to drive");
        }

        String expected="Best Sellers";

        if(expected.equals("Best sellers")){
            System.out.println("Test Passes");
        } else {
            System.out.println("Failed");
        }


    }
}
