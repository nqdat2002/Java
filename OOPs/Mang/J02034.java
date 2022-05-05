package OOPs.Mang;

import java.util.Scanner;
import java.util.Arrays;

public class J02034 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = 1;
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++) a[i] = ip.nextInt();
            Arrays.sort(a);
            int cnt = 0;
            for(int i = 1; i <= a[n - 1]; i ++){
                if(!Binary_Search(a, n, i)){
                    cnt++;
                    System.out.println(i);
                }
            }
            if(cnt == 0) System.out.println("Excellent!");
            t--;
        }
        ip.close();
    }
    public static boolean Binary_Search(int [] a, int n, int x){
        int l = 0, r = n - 1;
        while(l <= r){
            int m = (l + r) >> 1;
            if(a[m] == x)
                return true;
            else if(a[m] < x)
                l = m + 1;
            else r = m - 1;
        }
        return false;
    }
}