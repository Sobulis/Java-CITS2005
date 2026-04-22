public class CircleTools {
    public static final double PI = 3.14159;
    public static double area(double radius){
        return PI * radius * radius;
    }
    public static double circumference(double radius){
        return 2*PI*radius;
    }
    public static void main(String[] args){
        System.out.println("Area of a circle with radius 5: "+area(5));
        System.out.println("Circumference of a circle with radius 5: "+circumference(5));
    }
}
