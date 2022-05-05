package OOPs.XauKyTu;

import java.util.Scanner;

public class J03008{
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String x = ip.nextLine();
        x.isEmpty();
        while(t > 0){
            t--;
            String s = ip.nextLine();
            if(Check(s))
                System.out.println("YES");
            else System.out.println("NO");
        }
        ip.close();
    }
    public static boolean Check(String s){
        int n = s.length(), cnt = 0, cnt2 = 0;
        for(int i = 0; i < n; i ++){
            char c = s.charAt(i);
            if(c == '2' || c == '3' || c == '5' || c == '7') cnt++;
        }
        for(int i = 0; i < n / 2; i ++){
            char c = s.charAt(i);
            char d = s.charAt(n - i - 1);
            if(c == d) cnt2++;
        }
        return cnt == n && cnt2 == n / 2;
    }
}