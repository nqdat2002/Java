package OOPs.Mang;

import java.util.Scanner;

public class J01018 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            long n = ip.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
        ip.close();
    }
    public static boolean check(long n){
        int cnt = 0;
        long sum = 0;
        long [] a = new long[20];
        int i = 0;
        while(n > 0){
            long t = n % 10;
            sum += t;
            a[i] = t;
            i ++;
            n /= 10;
        }
        for(int j = 0; j < i - 1; j ++){
            if(a[j] - a[j + 1] == 2 || a[j] - a[j + 1] == -2)
                cnt++;
        }
        return cnt == i - 1 && sum % 10 == 0;
    }
}