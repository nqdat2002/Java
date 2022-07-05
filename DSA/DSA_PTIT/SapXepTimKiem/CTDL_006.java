package DSA.SapXepTimKiem;

import java.util.Scanner;

public class CTDL_006 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i ++)
            a[i] = ip.nextInt();
        boolean [] check = new boolean[10005];
        for(int i = 0; i < n; i ++){
            if(!check[a[i]]){
                check[a[i]] = true;
                System.out.print(a[i] + " ");
            }
        }
        ip.close();
    }
}