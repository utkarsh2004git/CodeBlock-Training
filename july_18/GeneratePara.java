


public class GeneratePara {
    

    // public static void generateParenthesis(int n,String ans) {
    //     if(n==0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     generateParenthesis(n-1, ans+"(");
    //     generateParenthesis(n-1, ans+")");

    // }
    

    public static void answer(int n,int close,int open, String ans ){
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
        if(open<n)
        answer(n, close, open+1, ans+"(");
        
        if(close<open)
        answer(n, close+1, open, ans+")");
    }

    public static void main(String[] args) {
        int n=3;
        // generateParenthesis(n*2, "");
        answer(n, 0, 0, "");
    }
}
