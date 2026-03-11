import java.util.Scanner;
public class Break {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Are you ready for this program to end? Enter True or False");
            boolean answer = scanner.nextBoolean();
            if (answer){
                break;
            }
        }
    }
}
