package OOPs.Basic;

import java.util.Scanner;

public class J01007 {
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
            boolean ok = false;
            long n = ip.nextLong();
            for(int i = 0; i <= 92; ++i){
                if(n == f[i]){
                    System.out.println("YES");
                    ok = true;
                    break;
                }
            }
            if(!ok) System.out.println("NO");
            t--;
        }
        ip.close();
    }
}
