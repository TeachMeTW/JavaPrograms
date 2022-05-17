package MethodsRefresherLab;

public class Areas {
    public static double areaCircle(double radius) {
        return Math.PI*(Math.pow(radius,2));
    }
    public static double areaSquare(double side) {
        return Math.pow(side, 2);
    }
    public static double areaTriangle(double base, double height) {
        return (base * height)/2;
    }
    public static double areaRectangle(double base, double height) {
        return base * height;
    }
    public static double areaTrapezoid(double top, double bottom, double height) {
        return ((top+bottom)*(height/2));
    }
}
