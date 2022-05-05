package OOPs.Mang;

import java.util.Scanner;

public class J02004 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; ++i)
                a[i] = ip.nextInt();
            boolean ok = true;
            for(int i = 0; i < n / 2; ++i){
                if(a[i] != a[n - i - 1]){
                    System.out.println("NO");
                    ok = false;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            t--;
        }
        ip.close();
    }
}