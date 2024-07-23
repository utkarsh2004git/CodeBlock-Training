import java.util.*;

public class PalindromePartitioning {

    public static boolean isPalindrome(String s){
        int len=s.length();
        for(int i=0;i<=(len/2);i++){
            if(!(s.charAt(i)==(s.charAt(len-i-1)))){
                return false;
            }
        }
        return true;
    }

    public static void partition(String que,String ans,List<String> ll,List<List<String>> ss){
        if(que.length()==0){
            List<String> mn=new ArrayList<>(ll);
            ss.add(mn);
            return;
        }
        for(int i=1;i<=que.length();i++){
            String s=que.substring(0,i);
            if(isPalindrome(s)){
                ll.add(s);
                partition(que.substring(i),ans,ll,ss);
                ll.remove(ll.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        String str = "nitin";
        List<String> ll = new ArrayList<>();
        List<List<String>> ss = new ArrayList<>();
        partition(str,"",ll,ss);
        System.out.println(ss);
        
    }
}
