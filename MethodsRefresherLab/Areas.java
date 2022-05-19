package MethodsRefresherLab;

// #2 of instructions
public class Areas {
    // return double of the circle area from an inputted radius
    // #3
    public static double areaCircle(double radius) {
        return Math.PI*(Math.pow(radius,2));
    }
    // return double of the square area from an inputted side
    // #3-2
    public static double areaSquare(double side) {
        return Math.pow(side, 2);
    }
    // return double of the triangle area from a base and height
    // #3-3
    public static double areaTriangle(double base, double height) {
        return (base * height)/2;
    }
    // return double of the rectangle area from a base and height
    // #3-4
    public static double areaRectangle(double base, double height) {
        return base * height;
    }
    // return double of the trapezoid area from a top length, bottom length, and height
    // #3-5
    public static double areaTrapezoid(double top, double bottom, double height) {
        return ((top+bottom)*(height/2));
    }
}
