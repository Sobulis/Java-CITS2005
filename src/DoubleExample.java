public class DoubleExample {
    public static void main (String[] args){
        int x = 5;
        double y = 5.0;
        x = x/2;
        y = y/2;
        System.out.println("x = "+x); //rounds down from 2.5 to 2, when changing dt from double to int
        System.out.println("y = "+y);
    }
}
