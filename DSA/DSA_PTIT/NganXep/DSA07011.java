package DSA.NganXep;

import java.util.Scanner;
import java.util.Stack;

public class DSA07011 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String b = ip.nextLine();
        b.isEmpty();
        while(t--> 0){
            String s = ip.nextLine();
            int n = s.length();
            Stack<String> st = new Stack<>();
            for(int i = 0; i < n; ++i){
                char c = s.charAt(i);
                if(isOperator(c)){
                    String x = st.peek();
                    st.pop();
                    String y = st.peek();
                    st.pop();
                    st.push(c + y + x);

                }else{
                    char [] arr = {c};
                    String tmp = new String(arr);
                    st.add(tmp);
                }
            }
            System.out.println(st.peek());
        }

        ip.close();
    }
    public static boolean isOperator(char x){
        return x == '+' || x == '-' || x == '*' || x == '/';
    }
}
