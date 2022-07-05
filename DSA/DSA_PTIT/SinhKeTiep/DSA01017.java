package DSA.SinhKeTiep;

import java.util.Scanner;
public class DSA01017 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String s = ip.nextLine();
        s.isEmpty();
        while(t--> 0){
            String a = ip.nextLine();
            int n = a.length();
            System.out.print(a.charAt(0));
            for(int i = 1; i <= n; ++i){
                int x = a.charAt(i) - 48, y = a.charAt(i - 1) - 48;
                System.out.print(x ^ y);
            }
            System.out.println();
        }
        ip.close();
    }
}