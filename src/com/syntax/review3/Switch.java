package com.syntax.review3;

public class Switch {
    public static void main(String[] args) {
/*data types: no boolean, long, double, float
operators: no logical or relation

.toLpwerCase() or tpoUpperCase helps to use the words writen wit LOWER OR UPPER letters

 */
        String color="GReen";

        switch (color.toLowerCase()) {

            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Uknown color, action is also unknown");

        }
    }
}
