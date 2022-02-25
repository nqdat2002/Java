package Hoc;

import java.util.Scanner;

public class binhphuong {
    public static void main(String [] agrs){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t > 0){
            long a = nhap.nextLong();
            System.out.println(a * a);
            t--;
        }
        nhap.close();
    }
}
