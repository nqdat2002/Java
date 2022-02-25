package Hoc;

import java.util.Scanner;

public class laybotquanco {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int c = ip.nextInt();
            int m = ip.nextInt();
            if(c % (m + 1) == 0)
                System.out.println("Second");
            else 
                System.out.println("First");
            t--;
        }
        ip.close();

    }
    
}
