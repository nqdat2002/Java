package DSA.SapXepTimKiem;

import java.util.Scanner;

public class DSA06002{
    private static void Stable_Selection_Sort(int[] a, int n, int k){
        for (int i = 0; i < n - 1; i++){
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (Math.abs(a[min] - k) > Math.abs(a[j] - k))
                    min = j;
            int key = a[min];
            while (min > i){
                a[min] = a[min - 1];
                min--;
            }
            a[i] = key;
        }
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int k = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
            }
            Stable_Selection_Sort(a, n, k);
            for(int i = 0; i < n; i ++){
                System.out.print(a[i] + " ");
            }
            System.out.println("\n");
            t --;
        }
        ip.close();
    }
}