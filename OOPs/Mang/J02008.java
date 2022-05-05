package OOPs.Mang;

import java.util.Scanner;

public class J02008 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int j = 1; j <= t; j ++){
            int n = ip.nextInt();
            long res = 1;
            for(int i = 2; i <= n; ++i){
                res = lcm(res, i);
            }
            System.out.println(res);
        }
        ip.close();
    }
    public static long gcd(long a, long b){
        while(b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static long lcm(long a, long b){
        return (long)a * b / gcd(a, b);
    }
}