package DSA.SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06001 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
            }
            Arrays.sort(a);
            for(int i = 0; i < n / 2; i ++){
                System.out.print(a[n - i - 1] + " " + a[i] + " ");
            }
            if(n % 2 == 1) System.out.print(a[n / 2]);
            System.out.println("\n");
            t --;
        }
        ip.close();
    }
}
