public class IfExample {
    public static void main(String[] args){
        int a = 2, b = 7, c;
        c= 6;
        if (a+b >c){
            c = a+b;
            a = b;
        }
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}
