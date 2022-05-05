package OOPs.Basic;

import java.util.Scanner;

public class J01022{
    final static int mod = 1000 * 1000 * 1000 + 7;
    public static void main(String [] args){
        long [] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= 92; ++i){
            f[i] = f[i - 2] + f[i - 1];
        }
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            long k = ip.nextLong();
            System.out.println(Power(n, k - 1, f));
            t--;
        }
        ip.close();
    }
    public static int Power(int n, long k, long [] f){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k < f[n - 2])
            return Power(n - 2, k, f);
        return Power(n - 1, (long)(k - f[n - 2]), f);
    }

}
