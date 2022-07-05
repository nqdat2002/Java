package DSA.ChiavaTri;

import java.util.Scanner;

public class DSA04005 {
    public static int Pos(int n, long k, long f[]){
        if(n == 1) return 65;
        if(n == 2) return 66;
        if(k < f[n - 2]) return Pos(n - 2, k, f);
        return Pos(n - 1, k - f[n - 2], f);
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        long [] f = new long[93];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= 92; ++i) f[i] = f[i - 1] + f[i - 2];
        while(t > 0){
            int n = ip.nextInt();
            long k = ip.nextLong();
            System.out.println((char)Pos(n, k - 1, f));
            t--;
        }
        ip.close();
    }
}
