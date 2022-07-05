package DSA.ChiavaTri;

import java.util.Scanner;

public class DSA04004 {
    public static long Pos(long n, long k){
        if(k == (long)Math.pow(2, n - 1)) 
            return n;
        if(k < (long)Math.pow(2, n - 1))
            return Pos(n - 1, k);
        return Pos(n - 1, k - (long)Math.pow(2, n - 1));

    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            long n = ip.nextLong();
            long k = ip.nextLong();
            System.out.println(Pos(n, k));
            t--;
        }
        ip.close();
    }
}
