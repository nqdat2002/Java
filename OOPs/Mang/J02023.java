package OOPs.Mang;

import java.util.Scanner;

public class J02023 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t--> 0){
            int m = ip.nextInt(), s = ip.nextInt();
            if(s == 0 || s > m * 9){
                System.out.println("-1 -1");
                continue;
            }
            if(s == 0 && m == 1){
                System.out.println("0 0");
                continue;
            }
            int [] a = new int[m + 1], b = new int[m + 1];
            for(int i = 0; i < m; ++i){
                if(s > 9){
                    a[i] = b[i] = 9;
                    s -= 9;
                }else{
                    a[i] = b[i] = s;
                    s = 0;
                }
            }
            if(b[m - 1] == 0){
                b[m - 1] = 1;
                for(int i = m - 2; i >= 0; --i){
                    if(b[i] != 0){
                        --b[i];
                        break;
                    }
                }
            }
            for(int i = m - 1; i >= 0; --i) System.out.print(b[i]);
            System.out.print(" ");
            for(int i = 0; i < m; ++i) System.out.print(a[i]);
        }
        ip.close();
    }
}