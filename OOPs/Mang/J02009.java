package OOPs.Mang;

import java.util.Scanner;

public class J02009 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = 1;
        while(t-->0){
            int n = ip.nextInt();
            int [] a = new int[n], b = new int[n];
            for(int i = 0; i < n; ++i){
                a[i] = ip.nextInt();
                b[i] = ip.nextInt();
            }
            for(int i = 0; i < n - 1; ++i){
                for(int j = i + 1; j < n; ++j){
                    if(a[j] < a[i]){
                        int t1 = a[i]; a[i] = a[j]; a[j] = t1;
                        int t2 = b[i]; b[i] = b[j]; b[j] = t2;
                    }
                }
            }
            int res = a[0] + b[0];
            for(int i = 1; i < n; ++i){
                if(res < a[i]) res = a[i] + b[i];
                else res = res + b[i];
            }
            System.out.println(res);
        }
        ip.close();
    }
}