package DSA.SinhKeTiep;

import java.util.Scanner;
public class DSA01013 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String s = ip.nextLine();
        s.isEmpty();
        while(t--> 0){
            String a = ip.nextLine();
            int n = a.length();
            int [] b = new int[n];
            b[0] = a.charAt(0) - 48;
            for(int i = 1; i < n; ++i){
                int x = a.charAt(i) - 48;
                int y = b[i - 1];
                b[i] = x ^ y;
            }
            for(int i = 0; i < n; ++i) System.out.print(b[i]);
            System.out.println();
        }
        ip.close();
    }
}