package Hoc;

import java.util.Scanner;

public class tonggiaithua {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long ans = 0;
        for(int i = 1; i <= t; i ++){
            ans += giaithua(i);
        }
        System.out.println(ans);
        scanner.close();
    }
    public static long giaithua(int n){
        long res = 1;
        for(int i = 2; i <= n; i ++){
            res *= i;
        }
        return res;
    }
}
