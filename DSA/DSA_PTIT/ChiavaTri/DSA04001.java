package DSA.ChiavaTri;

import java.util.Scanner;

public class DSA04001 {
    final static long mod = 1000 * 1000 * 1000 + 7;
    public static long Power_big(long n, long k){
        if(k == 0) return 1;
        long tmp = Power_big(n, k / 2);
        if(k % 2 == 0) return tmp * tmp % mod;
        return n * (tmp * tmp % mod) % mod;
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            long n = ip.nextLong();
            long k = ip.nextLong();
            System.out.println(Power_big(n, k));
            t--;
        }
        ip.close();
    }
}
