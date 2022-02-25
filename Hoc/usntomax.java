package Hoc;

import java.util.Scanner;

public class usntomax{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0){
            long b = scanner.nextLong();
            long i = 2;
            if(isPrimeNumber(b))
                System.out.println(b);
            else{
                while(i <= b){
                    if(b % i == 0 && isPrimeNumber(b/i)){
                        System.out.println(b/i);
                        break;
                    }
                    i++;
                }
            }
            t --;
        }
        scanner.close();
    }

    public static boolean isPrimeNumber(long n) {
        if (n < 2) {
            return false;
        }
        long squareRoot = (long) Math.sqrt(n);
        for (long i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}