package OOPs.Basic;

import java.util.Scanner;

public class J01014 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            long n = ip.nextLong();
            long i = 2;
            if (Prime(n)) System.out.println(n);
            else {
                while (i <= n) {
                    if (n % i == 0 && Prime(n / i)) {
                        System.out.println(n / i);
                        break;
                    }
                    i++;
                }
            }
            t --;
        }
        ip.close();
    }
    public static boolean Prime(long n){
        if (n < 2) 
            return false;
        for (long i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
