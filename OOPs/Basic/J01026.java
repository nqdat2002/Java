package OOPs.Basic;

import java.util.Scanner;

public class J01026 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-->0){
            long n = ip.nextLong();
            System.out.println(Check(n));
        }
        ip.close();
    }
    public static String Check(long n){
        double x = Math.sqrt(n);
        if((long) x * x == n)
            return "YES"; 
        return "NO";
    }
}