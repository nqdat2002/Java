package DSA.SapXepTimKiem;

import java.util.Scanner;

public class DSA06020 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        while(t>0){
            int n = nhap.nextInt();
            int k = nhap.nextInt();
            int x = 0;
            int [] a = new int[n];
            for(int i = 0; i < n; i ++) a[i] = nhap.nextInt();
            for(int i = 0; i < n; i ++){
                if(a[i] == k){
                    x = 1;
                    System.out.println(1);
                    break;
                }
            }
            if(x == 0) System.out.println(0);
            t--;
        }
        nhap.close();
    }
}
