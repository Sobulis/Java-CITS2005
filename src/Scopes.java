public class Scopes {
    public static void main(String[] args){
        int x = 5;
        if (true){
            int y = 10;
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
        for (int i = 0; i < 1; i++){
            int y = 20;
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
        System.out.println("x="+x);
    }
}
