package DSA.SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06012 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int k = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++)
                a[i] = ip.nextInt();
            Arrays.sort(a);
            int x = 0;
            while(x < k){
                System.out.print(a[n - 1 - x] + " ");
                x++;
            }
            System.out.print("\n");
            t--;
        }
        ip.close();
    }
}