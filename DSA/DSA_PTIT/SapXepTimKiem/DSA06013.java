package DSA.SapXepTimKiem;

import java.util.Scanner;

public class DSA06013 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int x = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
            }
            int cnt = 0;
            for(int i = 0; i < n; i ++){
                if(a[i] == x) cnt++;
            }
            if(cnt == 0)
                System.out.println(-1);
            else 
                System.out.println(cnt);
            t --;
        }
        ip.close();
    }
}
