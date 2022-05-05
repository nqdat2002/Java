package OOPs.Basic;

import java.util.Scanner;

public class J01011{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(BSCNN(a, b) + " " + USCLN(a, b) );
            t --;
        }
        scanner.close();

    }
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }
}
