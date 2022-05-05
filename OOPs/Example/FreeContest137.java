package OOPs.Example;

import java.math.BigInteger;
import java.util.Scanner;

public class FreeContest137 {
    public static BigInteger factorialHavingLargeResult(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
    public static void main( String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t--> 0){
            String c = ip.next();
            int sum = 0;
            int k = ip.nextInt(), n = c.length();
            for(int i = 0; i < n; ++i){
                char b = c.charAt(i);
                sum += (b - 48);
            }
            if(k == 1){
                System.out.println("YES");
                continue;
            }
            if(k == 2){
                char d1 = c.charAt(n - 1);
                if(d1 % 2 != 0) System.out.println("NO");
                else System.out.println("YES");
            }
            else{
                if(sum % 3 == 0 && c.charAt(n - 1) % 2 == 0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        ip.close();
    }
}
