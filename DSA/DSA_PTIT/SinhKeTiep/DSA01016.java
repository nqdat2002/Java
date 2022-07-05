package DSA.SinhKeTiep;

import java.util.Scanner;
public class DSA01016 {
    static int n, k, s, a[];
    public static void Try(int i, int k, int s){
        for(int j = k; j >= 1; j--){
            if(s + j <= n){
                a[i] = j;
                s += j;
                if(s == n) output(i);
                else Try(i + 1, j, s);
                s -= j;
            }
        }
    }
    public static void output(int n){
        System.out.println("(");
        for(int i = 1; i < n; i ++)
            System.out.println(a[i] + " ");
        System.out.println(a[n] + " ");
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            n = ip.nextInt();
            for(int i = 0; i <= n; i ++) a[i] = 0;
            Try(1, n, 0);
            System.out.println("\n");
            t--;
        }
        ip.close();
    }
}