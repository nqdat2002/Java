package OOPs.Mang;

import java.util.Scanner;

public class J02101 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-->0){
            int n = ip.nextInt();
            int [][] a = new int[n + 1][n + 1];
            for(int i = 1; i <= n; ++i){
                for(int j = 1; j <= n; ++j){
                    a[i][j] = ip.nextInt();
                }
            }
            for(int i = 1; i <= n; ++i){
                if(i % 2 == 1){
                    for(int j = 1; j <= n; ++j){
                        System.out.print(a[i][j] + " ");
                    }
                }
                else {
                    for(int j = n; j >= 1; --j){
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
        ip.close();
    }
}