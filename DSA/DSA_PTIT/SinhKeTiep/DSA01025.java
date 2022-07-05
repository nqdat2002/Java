package DSA.SinhKeTiep;

import java.util.Scanner;
public class DSA01025 {
    public static void Try(int i, int n, int k, int [] a){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                output(n, k, a);
            }else Try(i + 1, n, k, a);
        }
    }
    public static void output(int n, int k, int [] a){
        for(int i = 1; i <= k; i ++)
            System.out.print((char)(a[i] - 1 + 'A'));
        System.out.print(" ");
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int k = ip.nextInt();
            int [] a = new int[k + 1];
            Try(1, n, k, a);
            System.out.println();
            t--;
        }
        ip.close();
    }
}