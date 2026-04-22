package Projects;
import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
    public static BigInteger FactorialCalc(int n){
        BigInteger total = BigInteger.valueOf(1);
        for (int i = n; i>= 1; i--){
            total = total.multiply(BigInteger.valueOf(i));
        }
        return total;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        BigInteger factorial = FactorialCalc(num);
        System.out.println("The factorial of "+num+" is "+factorial);
    }
}
