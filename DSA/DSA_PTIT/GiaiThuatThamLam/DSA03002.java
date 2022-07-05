package DSA.GiaiThuatThamLam;

import java.util.Scanner;

public class DSA03002 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        long x = ip.nextLong();
        long y = ip.nextLong();
        String a = String.valueOf(x);
        String b = String.valueOf(y);
        String c = a, d = b;
        String m = change(a, '6', '5');
        String n = change(b, '6', '5');
        String p = change(c, '5', '6');
        String q = change(d, '5', '6');
        System.out.print((Long.parseLong(m) + Long.parseLong(n)));
        System.out.print(" ");
        System.out.print((Long.parseLong(p) + Long.parseLong(q)));
        ip.close();
    }
    public static String change(String s, char x, char y){
        int n = s.length();
        for(int i = 0; i < n; ++i){
            if(s.charAt(i) == x) {
                char c = s.charAt(i);
                s.replace(c, y);
            }
        }
        return s;
    }
}
