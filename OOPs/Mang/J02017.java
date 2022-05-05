package OOPs.Mang;

import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = 1;
        while(t > 0){
            int n = ip.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i ++) a[i] = ip.nextInt();
            Stack<Integer> st = new Stack<Integer>();
            for(int i = 0; i < n; i ++){
                if(st.isEmpty())
                    st.push(a[i]);
                else if((a[i] + st.peek()) % 2 != 0)
                    st.push(a[i]);
                else st.pop();
            }
            System.out.println(st.size());
            t--;
        }
        ip.close();
    }
}