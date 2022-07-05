package DSA.SinhKeTiep;

import java.util.Scanner;
public class DSA01012 {
    public static void Try(int i, int n, int [] a){
        for(int j = 0; j <= 1; j++){
            a[i] = j;
            if(i == n){
                System.out.print(a[1]);
                for(int k = 2; k <= n; ++k){
                    System.out.print(a[k] ^ a[k - 1]);
                }
                System.out.print(" ");
            }else Try(i + 1, n, a);
        }
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n + 1];
            Try(1, n, a);
            System.out.println();
            t--;
        }
        ip.close();
    }
}