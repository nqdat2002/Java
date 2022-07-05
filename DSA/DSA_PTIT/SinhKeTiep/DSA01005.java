package DSA.SinhKeTiep;

import java.util.Scanner;
public class DSA01005 {
    public static void Try(int i, int n, int [] a, boolean [] vs){
        for(int j = 1; j <= n; j++){
            if(!vs[j]){
                vs[j] = true;
                a[i] = j;
                if(i == n){
                    output(n, a);
                }
                else Try(i + 1, n, a, vs);
                vs[j] = false;
            }
        }
    }
    public static void output(int n, int [] a){
        for(int i = 1; i <= n; i ++)
            System.out.print(a[i]);
        System.out.print(" ");
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n + 1];
            boolean [] vs = new boolean[n + 1];
            Try(1, n, a, vs);
            System.out.println();
            t--;
        }
        ip.close();
    }
}