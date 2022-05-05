package OOPs.Basic;

import java.util.Scanner;

public class J01002 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            long n = ip.nextInt();
            long x = n * (n + 1) / 2;
            System.out.println(x);
            t --;
        }
        ip.close();
    }
}
