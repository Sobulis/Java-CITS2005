public class IntLiterals {
    public static void main(String[] args){
        int a = 1_000_000; //Decimal
        int b = 0b101; //Binary
        int c = 0x1_F; //Hexadecimal
        int d = 0172; //Octal
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        long e =  0b1111111111111111111111111111111111111111L;
        long f = 0x1FFFFFFFFFFL;
        System.out.println(e);
        System.out.println(f);
    }
}
