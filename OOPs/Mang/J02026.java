package OOPs.Mang;

import java.util.ArrayList;
import java.util.Scanner;

public class J02026 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t--> 0){
            int n = ip.nextInt(), k = ip.nextInt();
            ArrayList<Integer>  a = new ArrayList<Integer>();
            int [] c = new int[n + 5];
            for(int i = 0; i < n; ++i) {
                int x = ip.nextInt();
                a.add(x);
            }
            c[0] = 0;
            a.sort((o1, o2) -> o1 - o2);
            Try(1, n, k, c, a);
        }
        ip.close();
    }
    public static void Try(int i, int n, int k, int c[], ArrayList<Integer> a){
        for(int j = c[i - 1] + 1; j <= n - k + i; ++j){
            c[i] = j;
            if(i == k){
                for(int h = 1; h <= k; ++h){
                    System.out.print((Integer) a.get(c[h] - 1) + " ");
                }
                System.out.println();
            }
            else Try(i + 1, n, k, c, a);
        }
    }
}