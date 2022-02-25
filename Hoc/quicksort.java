package Hoc;

import java.util.Arrays;
import java.util.Scanner;


public class quicksort {
    public static void main(String [] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t > 0){
            int n = nhap.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = nhap.nextInt();
            }
            Arrays.sort(a);
            for(int i = 0; i < n; i ++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.gc();
            t--;
        }
        nhap.close();

    }
}
