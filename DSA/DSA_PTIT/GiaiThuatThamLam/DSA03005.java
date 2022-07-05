package DSA.GiaiThuatThamLam;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA03005 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt(), k = ip.nextInt();
            k = Max(k, n - k);
            ArrayList<Integer> a = new ArrayList<Integer>();
            long sum = 0;
            for(int i = 0; i < n; i ++){
                int x = ip.nextInt();
                a.add(x);
                sum += x;
            }
            long res = 0;
            a.sort((o1, o2) -> (o2 - o1));
            for(int i = 0; i < k; i ++){
                res += a.get(i);
            }
            System.out.println((2 * res - sum));
            t--;
        }
        ip.close();
    }

    private static int Max(int x, int y) {
        if(x > y) return x;
        return y;
    }

}
