package com.syntax.review4;

public class NestedLoops {

    public static void main(String[] args) {

        for (int i=1; i<=3; i++){  //outer loop controls of complete iterations of inner loop

            System.out.println(i);

            for (int j=0; j<=1; j++){//inner loop Always depends on Outer loop

                System.out.println(j);

            }
        }


    }
}
