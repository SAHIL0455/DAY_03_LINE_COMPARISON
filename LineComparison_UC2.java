package com.company1;

import static java.lang.Math.sqrt;

public class LineComparison_UC2 {
    public static void main(String[] args) {
        System.out.println("Welcome to comparison computation program");
        int x1 = 2, x2 = 4, y1 = 3, y2 = 5;
        int a1 = 5, a2 = 6, b1 = 5, b2 = 7;
        double LengthOfLine1 = sqrt((x2-x1)^2+(y2-y1)^2);
        double LengthOfLine2 = sqrt((a2-a1)^2+(b2-b1)^2);
        if(LengthOfLine1 == LengthOfLine2){
            System.out.println("The Length of Line is equal");
        }else {
            System.out.println("The Length of Line is not equal");
        }
    }
}
