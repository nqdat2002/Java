package OOPs.Mang;

import java.util.Scanner;

public class J02020 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt(), k = ip.nextInt();
        int [] a = new int[n + 5];
        a[0] = 0;
        Try(1, a, n, k);
        System.out.println("Tong cong co " + Combina(n, k) + " to hop");
        ip.close();
    }
    public static void Try(int i, int [] a, int n, int k){
        for(int j = a[i - 1] + 1; j <= n - k + i; ++j){
            a[i] = j;
            if(i == k)
                PrintScreen(a, n, k);
            else Try(i + 1, a, n, k);
        }
    }
    public static void PrintScreen(int [] a, int n, int k){
        for(int i = 1; i <= k; i ++)
            System.out.print(a[i] + " ");
        System.out.print("\n");
    }
    public static int Combina(int n, int k){
        if(n == 0 || k == n) 
            return 1;
        if(k == 1) 
            return n;
        return Combina(n - 1, k - 1) + Combina(n - 1, k);
    }
}