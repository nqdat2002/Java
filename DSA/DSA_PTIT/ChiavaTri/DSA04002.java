package DSA.ChiavaTri;

import java.util.Scanner;

public class DSA04002 {
    final static long mod = 1000 * 1000 * 1000 + 7;
    public static long Power_big(long n, long k){
        if(k == 0) return 1;
        long tmp = Power_big(n, k / 2);
        if(k % 2 == 0) return tmp * tmp % mod;
        return n * (tmp * tmp % mod) % mod;
    }
    public static long Rev(long n){
        long res = 0;
        while(n > 0){
            long i = n % 10;
            res = res * 10 + i;
            n /= 10;
        }
        return res;
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            long n = ip.nextLong();
            System.out.println(Power_big(n, Rev(n)));
            t--;
        }
        ip.close();
    }
}
