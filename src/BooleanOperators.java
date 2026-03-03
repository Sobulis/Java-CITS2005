public class BooleanOperators {
    public static void main(String[] args){
        int x = 5;
        if (x>= 1 && x <= 10){ //Since x is larger than 1 and smaller than 10, this becomes True
            System.out.println("x is between 1 and 10");
        } else if (x >= 11 && x <= 20){
            System.out.println("x is between 11 and 20");
        }
    }
}
