package Hoc;

import java.util.Scanner;

public class timkiemnhiphan {
    public static void main(String [] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt(); int k = ip.nextInt();
            int m = 0;
            int [] a = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
            }
            for(int i = 0; i < n; i ++){
                if(a[i] == k){
                    System.out.println(i + 1);
                    m++;
                    break;
                }
            }
            if(m == 0) System.out.println("NO");
            t--;
        }
        ip.close();
    }
}

