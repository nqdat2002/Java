package Hoc;

import java.util.Scanner;

public class a{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0){
            long b = scanner.nextLong();
            if(b < 2) System.out.println("NO");
            if(isPrimeNumber(b)){
                System.out.println("YES");
            }
            else System.out.println("NO");
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