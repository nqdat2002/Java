package OOPs.Basic;

import java.util.Scanner;

public class J01021{
    final static int mod = 1000 * 1000 * 1000 + 7;
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        while(true){
            long n = ip.nextLong(), k = ip.nextLong();
            if(n == 0 && k == 0)
                break;
            System.out.println(Power(n, k));
        }
        ip.close();
    }
    public static long Power(long n, long k){
        if(k == 0)
            return 1;
        long t = Power(n, k / 2);
        if(k % 2 == 0)
            return t * t % mod;
        return n * (t * t % mod) % mod;
    }
}
