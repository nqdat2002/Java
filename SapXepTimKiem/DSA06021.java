package DSA.SapXepTimKiem;

import java.util.Scanner;

public class DSA06021 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int x = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
            }
            for(int i = 0; i < n; i ++){
                if(a[i] == x){
                    int r = i + 1;
                    System.out.println(r);
                    break;
                }
            }
            t --;
        }
        ip.close();
    }
}
