package MethodsRefresherLab;

public class Areas {
    // return double of the circle area from an inputted radius
    public static double areaCircle(double radius) {
        return Math.PI*(Math.pow(radius,2));
    }
    // return double of the square area from an inputted side
    public static double areaSquare(double side) {
        return Math.pow(side, 2);
    }
    // return double of the triangle area from a base and height
    public static double areaTriangle(double base, double height) {
        return (base * height)/2;
    }
    // return double of the rectangle area from a base and height
    public static double areaRectangle(double base, double height) {
        return base * height;
    }
    // return double of the trapezoid area from a top length, bottom length, and height
    public static double areaTrapezoid(double top, double bottom, double height) {
        return ((top+bottom)*(height/2));
    }
}
