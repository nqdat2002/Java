package DSA.NganXep;

import java.util.Scanner;
import java.util.Stack;

public class DSA07023 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String b = ip.nextLine();
        b.isEmpty();
        while(t--> 0){
            String s = ip.nextLine();
            Stack<String> st = new Stack<>();
            String [] arr = s.split(" ");
            int n = arr.length;
            for(int i = 0; i < n; ++i){
                st.add(arr[i]);
            }
            while(!st.isEmpty()){
                System.out.print(st.peek() + " ");
                st.pop();
            }
            System.out.println();
        }

        ip.close();
    }
}