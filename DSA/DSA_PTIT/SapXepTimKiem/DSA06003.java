package DSA.SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06003 {
    public static void swapp(int a, int b){
        int t = a;
        a = b;
        b = t;
    }
    
    public static int Selection_Sort(int[] a, int[] b, int n){
        int res = 0;
        for (int i = 0; i < n; i++){
            if(a[i] != b[i]){
                for (int j = i + 1; j < n; j++){
                    if(b[i] == a[j]){
                        int k = j;
                        swapp(a[i], a[k]);
                        res++;
                        break;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            int [] b = new int[n];
            for(int i = 0; i < n; i ++){
                a[i] = ip.nextInt();
                b[i] = a[i];
            }
            Arrays.sort(b);
            System.out.println(Selection_Sort(a, b, n));
            t --;
        }
        ip.close();
    }
}
