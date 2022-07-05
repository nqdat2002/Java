package DSA.SapXepTimKiem;

import java.util.Scanner;

public class CTDL_005 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = 1;
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++)
                a[i] = ip.nextInt();
            int x = ip.nextInt();
            for(int i = 0; i < n; i ++){
                if(a[i] != x)
                    System.out.print(a[i] + " ");
            }
            System.out.print("\n");
            --t;
        }
        ip.close();
    }
}