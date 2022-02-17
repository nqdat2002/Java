package DSA.SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06016 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int m = ip.nextInt();
            int [] a = new int[n];
            int [] b = new int[m];
            for(int i = 0; i < n; i ++)
                a[i] = ip.nextInt();
            for(int i = 0; i < m; i ++)
                b[i] = ip.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            System.out.println((long)a[n - 1]*b[0]);
            t--;
        }
        ip.close();
    }
}