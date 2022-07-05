package DSA.SinhKeTiep;

import java.util.Scanner;
public class DSA01007 {
    public static void Try(int i, int n, int [] a){
        for(int j = 0; j <= 1; ++j){
            a[i] = j;
            if(i == n){
                output(n, a);
            }else Try(i + 1, n, a);
        }
    }
    public static void output(int n, int [] a){
        for(int i = 1; i <= n; i ++)
            if(a[i] == 0) System.out.print("A");
            else System.out.print("B");
        System.out.print(" ");
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