package OOPs.Mang;

import java.util.Scanner;

public class J02010 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; ++i) a[i] = ip.nextInt();
        for(int i = 0; i < n - 1; i ++){
            for(int j = i + 1; j < n; j ++){
                if(a[i] > a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0; j < n; j ++) {
                System.out.print(a[j] + " ");
            }
            System.out.print("\n");
        }
        ip.close();
    }
    public static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }
}