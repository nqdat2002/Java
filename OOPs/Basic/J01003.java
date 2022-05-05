package OOPs.Basic;

import java.util.Scanner;

public class J01003 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        double a = ip.nextDouble();
        double b = ip.nextDouble();
        if(a == 0.0 && b == 0.0)
            System.out.println("VSN");
        else if(a == 0.0) 
            System.out.println("VN");
        else 
            System.out.format("%.2f", (double)-b/a);
        ip.close();
    }
}
