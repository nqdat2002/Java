package DSA.QuyHoachDong;

import java.util.Scanner;

public class DSA05025 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            long [] dp = new long[n + 5];
            dp[0] = 1;
            for(int i = 1; i <= n; ++i){
                dp[i] = 0;
                for(int j = 1; j <= 3; ++j)
                    if(j <= i)
                        dp[i] += dp[i - j];
            }
            System.out.println(dp[n]);
            t--;
        }
        ip.close();
    }
}