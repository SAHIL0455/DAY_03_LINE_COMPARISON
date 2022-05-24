package com.company1;

import static java.lang.Math.sqrt;

public class LineComparison_UC1 {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 4;
        int y1 = 3;
        int y2 = 5;
        double LengthOfLine = sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Length of Line is "+LengthOfLine);
    }
}
