package DSA.GiaiThuatThamLam;

import java.util.Arrays;
import java.util.Scanner;

public class DSA03004 {
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
            long x = 0, y = 0;
            for(int i = 0; i < n; i ++){
                if(i % 2 == 0) x = x * 10 + a[i];
                else y = y * 10 + a[i];
            }
            System.out.println((x + y));
            t--;
        }
        ip.close();
    }

}
