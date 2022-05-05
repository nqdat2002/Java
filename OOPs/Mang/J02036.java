package OOPs.Mang;

import java.util.Scanner;

public class J02036 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            t--;
            int n = ip.nextInt();
            long [] a = new long[n], b = new long[n + 2];
            for(int i = 0; i < n; i ++) a[i] = ip.nextLong();
            b[0] = a[0]; b[n] = a[n - 1];
            for(int i = 1; i < n; i ++)
                b[i] = lcm(a[i], a[i - 1]);
            for(int i = 0; i <= n; i++)
                System.out.print(b[i] + " ");
            System.out.println();
        }
        ip.close();
    }
    public static long gcd(long a, long b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static long lcm(long a, long b){
        return (long) a * b / gcd(a, b);
    }
}