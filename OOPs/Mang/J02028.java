package OOPs.Mang;

import java.util.Scanner;

public class J02028 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t--> 0){
            int n = ip.nextInt();
            long [] a = new long[n];
            long k = ip.nextLong();
            for(int i = 0; i < n; ++i) a[i] = ip.nextLong();
            for(int i = 1; i < n; ++i) a[i] += a[i - 1];
            Solve(a, n, k);
        }
        ip.close();
    }
    public static void Solve(long a[], int n, long k){
        if(k == 0){
            System.out.println("NO");
            return;
        }
        if(Binary_Search(a, k, 0, n - 1)){
            System.out.println("YES");
            return;
        }
        for(int i = 0; i < n; ++i){
            long x = a[i] + k;
            if(Binary_Search(a, x, 0, n - 1)){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static boolean Binary_Search(long a[], long x, int l, int r){
        while(l <= r){
            int m = (l + r) >> 1;
            if(a[m] == x) 
                return true;
            else if(a[m] > x) 
                r = m - 1;
		    else 
                l = m + 1;
        }
        return false;
    }
}