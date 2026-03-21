package Labs;

import java.util.Scanner;

class PrimeFinder{
    public static boolean primeFinder(int number){
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number %2==0 || number%3==0) return false;

        for (int num = 5; num*num<=number; num+=6){
            if (number%num==0 || number%(num+2)==0){
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int start, int end){
        int counter = 0;
        for (int i = start; i<=end; i++){
            if (primeFinder(i)){
                counter++;
            }
        }
        return counter;
    }

}


public class Lab2_E1 {
    public static void main(String[] args){
        Scanner loopNumbers = new Scanner(System.in);
        System.out.println("Enter the start");
        int start = loopNumbers.nextInt();
        System.out.println("Enter the end");
        int end = loopNumbers.nextInt();

        int count = PrimeFinder.countPrimes(start,end);
        System.out.println("Number of Primes: "+count);
        loopNumbers.close();

    }
}
