package Hoc;

import java.util.Scanner;
public class dichuyentrongmt {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int m = ip.nextInt();
            int n = ip.nextInt();
            int a[][] = new int[m][n];
            for(int i = 0; i < m; i ++){
                for(int j = 0; j < n; j ++){
                    a[i][j] = ip.nextInt();
                }
            }
            System.out.println(DQ(n - 1, n + m - 2));
            t--;
        }
        ip.close();
    }
    public static int DQ(int k, int n){
        if(k == 0 || k == n) 
            return 1;
	    else
            return DQ(k - 1, n - 1) + DQ(k, n - 1);
    }
}