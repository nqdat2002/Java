package DSA.SapXepTimKiem;

import java.util.Scanner;

public class DSA06011 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++)
                a[i] = ip.nextInt();
            int x = 100000;
            for(int i = 0; i < n; i ++){
                for(int j = i + 1; j < n; j ++){
                    if(Math.abs(a[i] + a[j]) < Math.abs(x))
                        x = a[i] + a[j];
                }
            }
            System.out.println(x);
            t--;
        }
        ip.close();
    }
}