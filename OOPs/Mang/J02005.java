package OOPs.Mang;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class J02005 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t  = 1;
        while(t > 0){
            int n = ip.nextInt(), m = ip.nextInt();
            Set<Integer> st = new HashSet<Integer>();
            for(int i = 0; i < n + m; ++i){
                int x = ip.nextInt();
                st.add(x);
            }
            for(int x: st){
                System.out.print(x + " ");
            }
            System.out.print("\n");
            t--;
        }
        ip.close();
    }
}