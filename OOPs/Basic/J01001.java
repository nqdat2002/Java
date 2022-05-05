package OOPs.Basic;

import java.util.Scanner;

public class J01001 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        if(a <= 0 || b <= 0)
            System.out.println(0);
        else System.out.println((a + b) * 2 + " " + a * b);
        ip.close();
    }
}
