package OOPs.Basic;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main( String [] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t > 0){
            String a, b;
            a = nhap.next();
            b = nhap.next();
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            BigInteger res = x.multiply(y);
            BigInteger ans = x.gcd(y);
            System.out.println(res.divide(ans));
            t--;
        }
        nhap.close();
    }
}
