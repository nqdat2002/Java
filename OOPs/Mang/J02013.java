package OOPs.Mang;

import java.util.Scanner;

public class J02013 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; ++i) a[i] = ip.nextInt();
        for(int i = 0; i < n; i ++){
            boolean ok = true;
            for(int j = 0;j < n - i - 1; j++){
                if(a[j] > a[j + 1]){
                    ok = false;
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                }
            }
            if(ok) break;
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0; j < n; j ++) {
                System.out.print(a[j] + " ");
            }
            System.out.print("\n");
        }
        ip.close();
    }
}