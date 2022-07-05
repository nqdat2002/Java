package DSA.SapXepTimKiem;

import java.util.Scanner;
import java.util.Arrays;

public class DSA06017 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int m = ip.nextInt();
            int [] a = new int[m + n];
            for(int i = 0; i < n + m; i ++)
                a[i] = ip.nextInt();
            Arrays.sort(a);
            for(int i = 0; i < n + m; i ++)
                System.out.print(a[i] + " ");
            System.out.println("\n");
            t--;
        }
        ip.close();
    }
}