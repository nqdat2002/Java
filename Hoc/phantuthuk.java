package Hoc;

import java.util.Arrays;
import java.util.Scanner;

public class phantuthuk {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int m = ip.nextInt();
            int k = ip.nextInt();
            int [] a = new int[n + m];
            for(int i = 0; i < n + m; i ++){
                a[i] = ip.nextInt();
            }
            Arrays.sort(a);
            int res = a[k - 1];
            System.out.println(res);
            t --;
        }
        ip.close();
    }
}
