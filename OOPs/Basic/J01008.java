package OOPs.Basic;

import java.util.Scanner;

public class J01008 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        for(int j = 0; j < t; j ++){
            int n = ip.nextInt();
            System.out.printf("Test " + (j + 1) + ": ");
            int c = 0;
            int i = 2;
            while(n > 1) {
                if(n % i == 0) {
                    c++;
                    if(n == i) {
                        System.out.printf(i + "(" + c + ")");
                    }
                    n /= i;
                } 
                else {
                    if(c > 0) {
                        System.out.printf(i + "(" + c + ") ");
                        c = 0;
                    }
                    i++;
                }
            }
            System.out.printf("\n");
        }
        ip.close();
    }
}
