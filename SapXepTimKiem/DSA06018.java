package DSA.SapXepTimKiem;

import java.util.Scanner;
import java.util.Arrays;

public class DSA06018 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
            }
            int cnt = 0;
            Arrays.sort(a);
            int l = a[0], r = a[n-1];
            for(int i = l; i <= r; i ++){
                if(!Binary_Search(a, 0, n - 1, i)){
                    cnt++;
                }
            }
            System.out.println(cnt);
            t --;
        }
        ip.close();
    }
    public static boolean Binary_Search(int a[], int l, int r, int x) {
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] == x) 
                return true;
            if(a[m] > x)
                r = m - 1;
            else
                l = m + 1;
        }
        return false;
    }
}
