public class Fibonacci {
    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        for (int i = 0; i<10; i++){
            System.out.println(f.fib(i));
        }
    }
    public int fib(int n){
        if (n<2){
            return 1;
        } else {
            return fib(n-1)+ fib(n-2);
        }
    }
}
