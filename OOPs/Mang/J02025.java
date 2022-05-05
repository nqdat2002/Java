package OOPs.Mang;

import java.util.ArrayList;
import java.util.Scanner;

public class J02025 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t--> 0){
            int n = ip.nextInt();
            ArrayList<Integer>  a = new ArrayList<Integer>();
            int [] c = new int[n];
            for(int i = 0; i < n; ++i) {
                int x = ip.nextInt();
                a.add(x);
                c[i] = 0;
            }
            a.sort((o1, o2) -> o2 - o1);
        //    System.out.println(a);
            ArrayList<ArrayList<Integer> > vs = new ArrayList<ArrayList<Integer> >();
            Try(0, n, c, a, vs);
            for(int i = 0; i < vs.size(); ++i){
                for(int j = 0; j < vs.get(i).size(); ++j){
                    System.out.print(vs.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
        ip.close();
    }
    public static void Try(int i, int n, int c[], ArrayList<Integer> a, ArrayList<ArrayList<Integer> > vs){
        for(int j = 0; j <= 1; ++j){
            c[i] = j;
            if(i == n - 1){
                int sum = 0;
                ArrayList<Integer> ar = new ArrayList<Integer>();
                for(int k = 0; k < n; ++k){
                    if(c[k] == 1){
                        ar.add((Integer) a.get(k));
                        sum += (Integer) a.get(k);
                    }
                }
                if(prime(sum))
                    vs.add(ar);
            }
            else Try(i + 1, n, c, a, vs);
        }
    }
    public static boolean prime(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}