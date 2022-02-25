package Hoc;

import java.util.Scanner;

public class songuyento{

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
        long t = (long) Math.sqrt(n);
        for (long i = 2; i <= t; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}