package DSA.SinhKeTiep;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DSA01023 {
    static int cnt = 0;
    public static void Try(int i, int n, int k, int [] a, int [] b){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                cnt += 1;
                Set<Integer> s = new HashSet<Integer>();
                for(int x = 1; x <= k; ++x){
                    s.add(b[x]); s.add(a[x]);
                }
                if(s.size() == k){
                    System.out.println(cnt);
                    return;
                }
            }else Try(i + 1, n, k, a, b);
        }
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int k = ip.nextInt();
            cnt = 0;
            int [] a = new int[k + 1], b = new int[k + 1];
            for(int i = 1; i <= k; ++i) b[i] = ip.nextInt();
            Try(1, n, k, a, b);
            t--;
        }
        ip.close();
    }
}