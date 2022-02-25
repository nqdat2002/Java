package Hoc;

import java.util.Scanner;

public class soconthieu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            long ans = 0;
            int n = in.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n - 1; i ++){
                a[i] = in.nextInt();
                ans = ans + a[i];
            }
            long res = n * (n + 1) / 2;
            System.out.println((res - ans));
            t--;
        }
        in.close();
    }
}
