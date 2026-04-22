package Projects;

public class Counter {
    private static int count = 5;

    public static int getCount(){
        return count;
    }
    public static void increment(){
        count +=1;
    }
    public static void decrement(){
        count -= 1;
    }
    public static void main(String[] args){
        Counter.increment();
        decrement();
        increment();
        System.out.println(Counter.getCount());
    }
}
