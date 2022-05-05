package OOPs.Mang;

import java.util.Scanner;

public class J02106 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = 1;
        while(t-->0){
            int n = ip.nextInt();
            int [][] a = new int[n + 1][4];
            for(int i = 1; i <= n; ++i){
                for(int j = 1; j <= 3; ++j){
                    a[i][j] = ip.nextInt();
                }
            }
            int cnt = 0;
            for(int i = 1; i <= n; ++i){
                int sum1 = 0, sum0 = 0;
                for (int j = 1; j <= 3; j++) {	
                    if (a[i][j] == 1)
                        sum1 ++;
                    else sum0 ++;
                }
                if (sum1 > sum0)
                    cnt++;
            }
            System.out.println(cnt);
        }
        ip.close();
    }
}