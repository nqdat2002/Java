package DSA.GiaiThuatThamLam;

import java.util.Scanner;

public class DSA03001 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int [] a = new int[] {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        int t = ip.nextInt();
        while(t > 0){
            long n = ip.nextLong();
            long res = 0;
            for(int i = 9; i >= 0; --i){
                res += n / a[i];
                n %= a[i];
            }
            System.out.println(res);
            t--;
        }
        ip.close();
    }
}
