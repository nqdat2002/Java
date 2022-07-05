package DSA.SinhKeTiep;

import java.util.Scanner;
public class DSA01008 {
    public static void Try(int i, int n, int k, int [] a){
        for(int j = 0; j <= 1; j++){
            a[i] = j;
            if(i == n){
                output(n, k, a);
            }else Try(i + 1, n, k, a);
        }
    }
    public static void output(int n, int k, int [] a){
        int cnt = 0;
        for(int i = 1; i <= n; i++)
            if(a[i] == 1) cnt++;
        if(cnt == k){
            for(int i = 1; i <= n; ++i) System.out.print(a[i]);
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int k = ip.nextInt();
            int [] a = new int[n + 1];
            Try(1, n, k, a);
            System.out.println();
            t--;
        }
        ip.close();
    }
}