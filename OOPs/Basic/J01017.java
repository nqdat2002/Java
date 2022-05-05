package OOPs.Basic;

import java.util.Scanner;

public class J01017 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String b = ip.nextLine();
        b.isEmpty();
        while(t > 0){
            String x = ip.nextLine();
            int n = x.length(), cnt = 0;
            for(int i = 0; i < n - 1; i ++){
                char c = x.charAt(i), d = x.charAt(i + 1);
                if(c - d == 1|| c - d == -1) cnt++;
            }
            if(cnt == n - 1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
        ip.close();
    }
}