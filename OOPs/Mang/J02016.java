package OOPs.Mang;

import java.util.Arrays;
import java.util.Scanner;

public class J02016 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-->0){
            int n = ip.nextInt();
            long [] a = new long[n];
            for(int i = 0; i < n; ++i) a[i] = ip.nextLong();
            System.out.println(Check(a, n));
            
        }
        ip.close();
    }
    public static String Check(long [] a, int n){
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i ++)
            a[i] = a[i] * a[i];
        for (int i = n - 1 ; i >= 2 ; i --) {
            int l = 0,  r = i - 1; 
            while (l <= r) {
                if (a[l] + a[r] == a[i])
                    return "YES";
                if(a[l] + a[r] < a[i]) 
                    ++l;
                else --r;
            }
        }
        return "NO";
    }
}