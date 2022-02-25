package Hoc;

import java.util.Scanner;
public class tongchuso {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t > 0){
            int n = in.nextInt();
            int res = 0;
            while(n > 0){
                res = res + n % 10;
                n /= 10;
            }
            System.out.println(res);
            t--;
        }
        in.close();
    } 
        

}
