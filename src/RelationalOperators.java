public class RelationalOperators {
    public static void main(String[] args){
        boolean x = 1 < 2;
        boolean y = 7 != 7;
        boolean z = x == y;
        if (z != true){
            System.out.println("z is false"); //since x is true and y is false, z becomes false
        }
    }
}
