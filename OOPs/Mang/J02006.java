package OOPs.Mang;

import java.util.Scanner;

public class J02006 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt(), m = ip.nextInt();
        int [] a = new int[1005], b = new int[1005];
        for(int i = 0; i < n; ++i) {
            int x = ip.nextInt();
            a[x]++;
        }
        for(int i = 0; i < m; ++i) {
            int x = ip.nextInt();
            b[x]++;
        }
        for(int i = 0; i < 1005; ++i){
            if(a[i] != 0 && b[i] != 0) System.out.print(i + " ");
        }
        ip.close();
    }
}