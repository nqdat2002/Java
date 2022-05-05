package OOPs.Mang;

import java.util.Scanner;

public class J02012 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; ++i) a[i] = ip.nextInt();
        System.out.println("Buoc " + 0 + ": " + a[0]);
        for(int i = 1; i < n; i ++){
            int x = a[i], j = i - 1;
            while(j >= 0 && a[j] > x){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = x;
            System.out.print("Buoc " + (i) + ": ");
            for(int k = 0; k < i + 1; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.print("\n");
        }
        ip.close();
    }
}