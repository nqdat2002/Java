package Hoc;

import java.util.Scanner;

public class tansuatle {
    public static void main(String [] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t > 0){
            long y;
            long n = nhap.nextLong();
            long x = nhap.nextLong();
            for(long i = 1; i <= n - 1; i ++){
                y = nhap.nextLong();
                x ^= y;
            }
            System.out.println(x);
        }
        nhap.close();

    }
}
