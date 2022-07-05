package DSA.ChiavaTri;

import java.util.Scanner;

public class DSA04017 {
    public static int Binary_Search(int a[], int b[], int n) {
        int res = n, l = 0, r = n - 1;
        while(l <= r){
            int m = (l + r) >> 1;
            if(a[m] == b[m]) l = m + 1;
            else {
                r = m - 1;
                res = m;
            }
        }
        return res;
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            int [] b = new int[n - 1];
            for(int i = 0; i < n; ++i) a[i] = ip.nextInt();
            for(int i = 0; i < n - 1; ++i) b[i] = ip.nextInt();
            System.out.println((Binary_Search(a, b, n) + 1));
            t--;
        }
        ip.close();
    }
}
