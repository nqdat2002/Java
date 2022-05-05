package OOPs.Basic;

import java.util.Scanner;

public class J01013 {
    static boolean[] a = new boolean[2*100005];
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        a[0] = a[1] = true;
        for(int i = 2; i * i <= 2*100003; ++i){
            if(a[i] == false){
                for(int j = i*i; j <= 2*100003; j += i)
                    a[j] = true;
            }
        }
        int t = ip.nextInt();
        int res = 0;
        for(int i = 0; i < t; i ++){
            int n = ip.nextInt();
            int j = 2;
            while(j <= n){
                if(!a[n]) { res += n; break;}
                if(!a[j]){
                    if(n%j==0){
						while (n%j==0) {
                            res += j;
                            n /= j;
						}
					}	
                }
                j++;
            }
        }
        System.out.println(res);
        ip.close();
    }

}
