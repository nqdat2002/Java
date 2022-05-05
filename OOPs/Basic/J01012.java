package OOPs.Basic;

import java.util.Scanner;

public class J01012 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            long n = ip.nextInt();
            check(n);
            t --;
        }
        ip.close();
    }
    public static void check(long n){
        int cnt = 0;
	    for(long i = 1; i < Math.sqrt(n); i ++){
            if(n % i == 0){
                if(i % 2 == 0) 
                    cnt ++;
                if((n / i) % 2 == 0) 
                    cnt ++;
		    }
	    }
        if(n / (long)(Math.sqrt(n)) == Math.sqrt(n)){
            if(n / (long)(Math.sqrt(n)) % 2 == 0)
                cnt ++;
        }
        System.out.println(cnt);
    }
}
