package OOPs.Mang;

import java.util.Scanner;

public class J02019 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt(), b = ip.nextInt();
        int [] f = new int[1000005];
        for(int i = 1; i <= b; ++i){
            for(int j = 2 * i; j <= b; j += i){
                f[j] += i;
            }
        }
        int cnt = 0;
        for(int i = a; i <= b; ++i){
            if(f[i] > i) cnt ++;
        }
        System.out.println(cnt);
        ip.close();
    }
}