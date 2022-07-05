package DSA.GiaiThuatThamLam;

import java.util.Arrays;
import java.util.Scanner;

public class DSA03003 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        long mod = 1000000007;
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
            }
            Arrays.sort(a);
            long res = 0;
            for(int i = 0; i < n; i ++){
                res = res + ((a[i] % mod ) * i % mod);
            }
            System.out.println(res);
            t--;
        }
        ip.close();
    }
}
