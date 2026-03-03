package Projects;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args){
        Random randomizer = new Random();
        int secretNumber = randomizer.nextInt(100);
        System.out.println("I am thinking of a number between 1 and 100. Guess the number: ");
        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        int tries = 0;
        while (guess != secretNumber){
            guess = scanner.nextInt();
            if (guess < secretNumber){
                System.out.println("Higher. Try Again!");
            } else if (guess > secretNumber){
                System.out.println("Lower. Try Again!");
            }
            tries ++;
        }
        System.out.println("Good job! You got it in "+tries+" tries");
    }
}
