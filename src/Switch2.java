import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.next();
        switch (word){
            case "hello":
                System.out.println("Hello to you to");
                break;
            case "goodbye":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("I don't understand");
        }
    }
}
