package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        /*
        Declare 2 Variable for DL and car

        if you have DL then I will check if you have a car
         */

        boolean diverLicense = true;
        boolean car = false;
        if (diverLicense) {
            System.out.println("Let's check if you have a car");
            if (car) {
                System.out.println("You can drive to work");
            } else {
                System.out.println("You will need to take a bus or uber");
            }
        } else {
            System.out.println("You should get DL");
        }
    }
}
