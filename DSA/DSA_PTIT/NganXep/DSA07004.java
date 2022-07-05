package DSA.NganXep;

import java.util.Scanner;
import java.util.Stack;

public class DSA07004 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String b = ip.nextLine();
        while(t > 0){
            b = "";
            String s = ip.nextLine();
            int n = s.length();
            Stack<Character> st = new Stack<>();
            int cnt = 0;
            for(int i = 0; i < n; ++i){
                char c = s.charAt(i);
                if(c == ')' && !st.isEmpty()){
                    if(st.peek() == '(') st.pop();
                    else st.push(c);
                }
                else st.push(c);
            }
            n = st.size();
            while(!st.isEmpty() && st.peek() == '('){
                st.pop();
                ++cnt;
            }
            System.out.println((cnt % 2 + n / 2) + b);
            t--;
        }

        ip.close();
    }
}
