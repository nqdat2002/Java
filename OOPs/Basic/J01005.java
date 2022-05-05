package OOPs.Basic;

import java.util.Scanner;
public class J01005 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int h = ip.nextInt();
            for(int i = 1; i < n; i ++){
                System.out.format("%.6f", h * Math.sqrt((double)i/n));
                System.out.print(" ");
            }
            System.out.print("\n");
            t--;
        }
        ip.close();
    }
}
