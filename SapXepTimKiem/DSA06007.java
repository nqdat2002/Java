package DSA.SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06007 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            int [] b = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
                b[i] = a[i];
            }
            Arrays.sort(b);
            int x = 0, y = 0;
            for(int i = 0; i < n; i ++){
                if(a[i] !=  b[i]){
                    x = i;
                    break;
                }
            }
            for(int i = n - 1; i >= 0; i --){
                if(a[i] !=  b[i]){
                    y = i;
                    break;
                }
            }
            x ++;
            y ++;
            System.out.println(x + " " + y);
            t--;
        }
        ip.close();
    }
}