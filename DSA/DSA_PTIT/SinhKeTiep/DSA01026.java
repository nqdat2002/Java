package DSA.SinhKeTiep;

import java.util.Scanner;
public class DSA01026 {
    public static boolean check(int [] a, int n){
        if(a[1] == 1 || a[n] == 0) 
                return false;
        for (int i = 1; i <= n; ++i){
            if(a[i] + a[i + 1] == 0)
                return false;
            if(a[i] + a[i + 1] + a[i + 2] + a[i + 3] == 4)
                return false;
        }
        return true;
    }
    public static void Try(int i, int n, int [] a){
        for(int j = 1; j >= 0; j--){
            a[i] = j;
            if(i == n){
                if(check(a, n)){
                    for(int k = 1; k <= n; ++k){
                        if(a[k] == 0) System.out.print("8");
                        else System.out.print("6");
                    }
                    System.out.println();
                }
            }else Try(i + 1, n, a);
        }
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = 1;
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n + 16];
            Try(1, n, a);
            System.out.println();
            t--;
        }
        ip.close();
    }
}