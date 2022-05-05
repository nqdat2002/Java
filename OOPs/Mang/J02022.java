package OOPs.Mang;

import java.util.Scanner;

public class J02022 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-->0){
            int n = ip.nextInt();
            int [] a = new int[n + 5];
            boolean [] visited = new boolean[n + 5];
            Try(1, a, n, visited);
            System.out.println(" ");
        }
        ip.close();
    }
    public static void Try(int i, int [] a, int n, boolean [] visited){
        for(int j = 1; j <= n; ++j){
            if(!visited[j]){
                visited[j] = true;
                a[i] = j;
                if(i == n) {
                    if(check(n, a))
                        PrintScreen(a, n);
                }
                else Try(i + 1, a, n, visited);
                visited[j] = false;
            }
        }
    }
    public static void PrintScreen(int [] a, int n){
        for(int i = 1; i <= n; i ++)
            System.out.print(a[i]);
        System.out.print("\n");
    }
    public static boolean check(int n, int [] a){
        for(int i = 1; i < n; ++i){
            if(a[i] - a[i + 1] == 1 || a[i] - a[i + 1] == -1)
                return false;
        }
        return true;
    }
}