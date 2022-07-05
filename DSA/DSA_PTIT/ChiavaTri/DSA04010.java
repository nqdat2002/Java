package DSA.ChiavaTri;

import java.util.Scanner;

public class DSA04010 {
    private static int max_val(int a, int b){
        if(a > b) return a;
        return b;
    }
    public static int Max_sum(int a[], int n){
        int res = -100006;
        for(int i = 0; i < n - 1; ++i){
            int sum = a[i];
            for(int j = i + 1; j < n; ++j){
                sum += a[j];
                res = max_val(res, sum);
            }
        }
        return res;
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
            }
            System.out.println(Max_sum(a, n));
            t --;
        }
        ip.close();
    }
}
