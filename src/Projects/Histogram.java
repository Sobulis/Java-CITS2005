package Projects;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args){
        int[] histogram = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers in between 1 and 10:");
        while (sc.hasNextInt()){ //Loop until the user enters something that isn't an int
            int num = sc.nextInt();
            if (num<1|| num>10){
                System.out.println("Invalid Number: "+num+". Enter a number between 1 and 10");
                continue;
            }
            histogram[num]++;
        }
        for (int i = 1; i < histogram.length; i++){
            System.out.print(i+": ");
            for (int j = 0; j<histogram[i]; j++){
                System.out.print("*");
            System.out.println();
            }
        }
    }
}
