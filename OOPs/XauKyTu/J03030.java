package OOPs.XauKyTu;

import java.util.Scanner;

public class J03030{
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        int n = s.length();
        int c1 = 0, c2 = 0;
        for(int i = 0; i < n; i ++){
            char c = s.charAt(i);
            if(c == 'A'){
                if(c1 < c2){
                    c2 = c1 + 1;
                }else c2++;
            }else{
                if(c1 < c2) c1++;
                else c1 = c2 + 1;
            }
        }
        System.out.println(c1);
        ip.close();
    }
}