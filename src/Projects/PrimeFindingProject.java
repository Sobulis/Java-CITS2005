package Projects;
import java.util.Scanner;

class PrimeFinder{
//    public static boolean isPrime(int number){
//        if (number <= 1) return false;
//        if (number <=3) return true;
//
//        if (number %2 == 0 || number %3 == 0) return false;
//        for (int i = 5; i*i <= number; i+=6){
//            if (number % i == 0 || number % (i+2)==0) return false;
//        }
//        return true;
//    }
    public static boolean isPrime(int number){
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i*i <= number; i+=2){
            if (number % i == 0) return false;
        }
        return true;
    }
    public static int countPrimes(int start, int end){
        int count = 0;
        for (int i = start; i <= end; i++){
            if (isPrime(i)) count ++;
        }
        return count;
    }
}


public class PrimeFindingProject {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = input.nextInt();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        int total = PrimeFinder.countPrimes(num1, num2);
        System.out.println("The total number of prime numbers between "+num1+" and "+num2+" is "+total);
    }

}
