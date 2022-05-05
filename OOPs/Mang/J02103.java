package OOPs.Mang;

import java.util.Scanner;

public class J02103 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int x = 1; x <= t; ++ x){
            int n = ip.nextInt(), m = ip.nextInt();
            int [][] a = new int[n + 1][m + 1], b = new int[m + 1][n + 1], c = new int[n + 1][n + 1];
            for(int i = 1; i <= n; ++i){
                for(int j = 1; j <= m; ++j)
                    a[i][j] = ip.nextInt();
            }
            for(int i = 1; i <= m; ++i){
                for(int j = 1; j <= n; ++j)
                    b[i][j] = a[j][i];
            }
            for(int i = 1; i <= n; ++i){
                for(int j = 1; j <= n; ++j)
                    for(int k = 1; k <= m; ++k){
                        c[i][j] += a[i][k] * b[k][j];
                    }
            }
            System.out.println("Test " + x + ": ");
            for(int i = 1; i <= n; ++i){
                for(int j = 1; j <= n; ++j)
                    System.out.print(c[i][j] + " ");
                System.out.println();
            }
        }
        ip.close();
    }
}