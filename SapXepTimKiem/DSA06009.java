package DSA.SapXepTimKiem;

import java.util.Scanner;

public class DSA06009 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int m = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++)
                a[i] = ip.nextInt();
            int cnt = 0;
            for(int i = 0; i < n; i ++)
                for(int j = i + 1; j < n; j ++){
                    if(a[i] + a[j] == m)
                        cnt++;
                }
            System.out.println(cnt);
            t--;
        }
        ip.close();
    }
}