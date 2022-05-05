package OOPs.Basic;

import java.util.Scanner;

public class J01006 {
    public static void main(String [] args){
        long [] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= 92; ++i){
            f[i] = f[i - 2] + f[i - 1];
        }
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            System.out.println(f[n]);
            t--;
        }
        ip.close();
    }
}
