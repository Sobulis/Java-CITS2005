package Projects;
import java.util.Scanner;

public class RectangleDrawer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of columns");
        int col = input.nextInt();
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();


        for (int i = 1; i<= col; i++){
            for (int j = 1; j<=rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
