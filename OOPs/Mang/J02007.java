package OOPs.Mang;

import java.util.Scanner;

public class J02007 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int j = 1; j <= t; j ++){
            int n = ip.nextInt();
            int [] a = new int[n];
            int [] fre = new int[100005];
            boolean [] check = new boolean[100005];
            for(int i = 0; i < n; ++i){
                a[i] = ip.nextInt();
                fre[a[i]]++;
            }
            System.out.println("Test " + j + ":");
            for(int i = 0; i < n; ++i){
                if(check[a[i]] == false){
                    System.out.println(a[i] + " xuat hien " + fre[a[i]] + " lan");
                    check[a[i]] = true;
                }
            }
        }
        ip.close();
    }
    public static boolean Prime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i ++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}