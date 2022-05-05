package OOPs.Mang;

import java.util.Scanner;

public class J02104 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = 1;
        while(t-->0){
            int n = ip.nextInt();
            int [][] a = new int[n + 1][n + 1];
            for(int i = 1; i <= n; ++i){
                for(int j = 1; j <= n; ++j)
                    a[i][j] = ip.nextInt();
            }
            for(int i = 1; i <= n; ++i){
                for (int j = 1; j <= n; j++) {	
                    if (a[i][j] == 1 && i < j)
                        System.out.println("(" + i + "," + j + ")");
                }
            }
        }
        ip.close();
    }
}