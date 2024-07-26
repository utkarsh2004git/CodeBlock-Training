package Stack;
import  java.util.*;
public class ValidParanthesis {

    public static boolean check(char a,Stack<Character> st){
        return ((a==']' && st.peek()=='[') || (a=='}' && st.peek()=='{') || (a==')' && st.peek()=='('));
    }

    public static boolean isValid(String s,Stack<Character> st){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='[' || s.charAt(i)=='{' ){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='}'||s.charAt(i)==']' || s.charAt(i)==')' ){
                if(check(s.charAt(i),st)){
                    st.pop();
                }
            }

        }
        return (st.isEmpty());
    }

    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String str="((()))";
        if(isValid(str,st)){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
