public class FinalVariable {
    public static void main(String[] args){
        final int x = 5;
        //x = 6; Error: Cannot assign a value to a final variable
        final double y = 1.0;
        // y = 1.1; // Error: Cannot assign a value to final variable 'y'
        System.out.println(x);
        System.out.println(y);
    }
}
