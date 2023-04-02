package compute;

import java.sql.SQLOutput;

public class MethodReturn {
    public static void main(String[] args) {
        double area1 = calculateArea(2.1, 3.6);
        double area2 = calculateArea(6.1, 7.6);

        if (area1 > area2) {
            System.out.println("Area 1 is the greatest!");
        } else {
            System.out.println("Area 2 is the greatest!");
        }
    }

    public static double calculateArea (double length, double breadth) {
        double area = length * breadth;
        return area;
    }
}
