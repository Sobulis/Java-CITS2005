public class TypePromotion {
    public static void main(String[] args){
        int x = 1;
        long y = 2;
        long z = x + y;
        double d = z+y;
        System.out.println(z); //3
        System.out.println(d); //5.0
    }
}
