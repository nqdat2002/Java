package OOPs.Mang;

import java.util.ArrayList;
import java.util.Scanner;

public class J02105 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = 1;
        while(t-->0){
            int n = ip.nextInt();
            int [][] a = new int[n][n];
            for(int i = 0; i < n; ++i){
                for(int j = 0; j < n; ++j)
                    a[i][j] = ip.nextInt();
            }
            ArrayList<ArrayList<Integer> > vs = new ArrayList<ArrayList<Integer> > (n);
            for(int i = 0; i < n; ++i) vs.add(new ArrayList<Integer>());
            for(int i = 0; i < n; ++i){
                for (int j = 0; j < n; j++) {	
                    if (a[i][j] == 1){
                        vs.get(i).add(j);
                    }
                }
            }
            for(int i = 0; i < vs.size(); ++i){
                System.out.print("List(" + (i + 1) + ") = " );
                for(int j = 0; j < vs.get(i).size(); j++){
                    System.out.print(vs.get(i).get(j) + 1 + " ");
                }
                System.out.println();
            }
        }
        ip.close();
    }
}