package DSA.NganXep;

import java.util.Scanner;
import java.util.Stack;

public class DSA07003 {
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        String b = ip.nextLine();
        b.isEmpty();
        while(t > 0){
            String s = ip.nextLine();
            int n = s.length();
            boolean check = true;
            Stack<Character> st = new Stack<>();
            for(int i = 0; i < n; ++i){
                char c = s.charAt(i);
                if(c == ')'){
                    check = true;
                    char top = st.peek();
                    st.pop();
                    while(top != '('){
                        if(top == '+' || top == '-' || top == '*' || top == '/'){
                            check = false;
                        }
                        top = st.peek();
                        st.pop();
                    }
                    if(check) break;
                }
                else st.push(c);
            }
            if(check == true) System.out.println("Yes");
            else System.out.println("No");
            t--;
        }

        ip.close();
    }
}
