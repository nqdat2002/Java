package Hoc;

import java.util.Scanner;

public class demday {
    public static final long p = 123456789;
    public static void main(String [] args){
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t > 0){
            long x = nhap.nextLong();
            System.out.println(PoW(2, x - 1, p));
            t--;
        }
        nhap.close();
    }
    public static long Mul(long a,long b, long p){
        if(b == 0) 
            return 0l;
        long tmp = Mul(a, b / 2, p);
        if(b % 2 == 1) 
            return (tmp * 2 + a) % p;
        return tmp * 2 % p;
    }
    public static long PoW(long n, long k, long p){
        if(k == 0) 
            return 1;
        if(k == 1) 
            return n % p;
        long tmp = PoW(n, k / 2, p);
        long a = Mul(tmp, tmp, p);
        if(k % 2 == 1) 
            return a * n % p;
        return a % p;
    }
    
}
