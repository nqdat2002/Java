package OOPs.Basic;

import java.util.Scanner;

public class J01024 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String b = ip.nextLine();
        b.isEmpty();
        while(t > 0){
            String x = ip.nextLine();
            int n = x.length(), cnt = 0;
            for(int i = 0; i < n; i ++){
                char c = x.charAt(i);;
                if(c == '0' || c == '1' || c == '2') cnt++;
            }
            if(cnt == n) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
        ip.close();
    }
}