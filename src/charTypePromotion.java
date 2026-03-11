public class charTypePromotion {
    public static void main(String[] args){
        char a = 'a';
        char b = 'b';
        char ab = (char)(a+b);
        char c = (char)(b+1);
        char z = 'y'+1;
        System.out.println(ab); // Ã
        System.out.println(c); // c
        System.out.println(z); // z
    }
}
