package OOPs.Basic;

import java.util.Scanner;
public class J01010 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            long n = ip.nextLong();
            if(!Count(n) || Change(n) == 0)
                System.out.println("INVALID");
            else if(Count(n) && Change(n) != 0)
                System.out.println(Change(n));
            t--;
        }
        ip.close();
    }
    public static boolean Count(long n) {
        int a = 0,b = 0;
		while(n > 0){
			long i = n % 10;
			if(i == 0 || i == 8 || i == 9 || i == 1)
			    a++;
			b++;
			n/=10;
		}
		return a == b;
    }
    public static long Change(long n){
        long res = 0;
        long [] a =  new long[100];
        int j = 0;
        while(n > 0){
            long i = n % 10;
            if(i == 8 || i==9 || i==0 || i == 1){
                if(i == 1)
                    i = 1;
                else
                    i = 0;
            }
            a[j++] = i;
            n /= 10;
        }
        for(int t = j - 1; t >= 0; t --){
            res = res * 10 + a[t];
        }
	    return res;
    }
}
