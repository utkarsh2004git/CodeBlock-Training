import java.util.*;

public class LetterCombination {
    
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    

    public static void answer(String digits,String ans){

        if(digits.length()==0){
            System.out.println(ans);
            return;
        }

        char ch=digits.charAt(0);
        String keypress=key[ch-'0'];

        for(int i=0;i<keypress.length();i++){
            answer(digits.substring(1), ans+keypress.charAt(i));
        }

    }


    public static void main(String[] args) {
        String digits="23";
        // answer(digits, "");
        List <String> ls=new ArrayList<>();
        System.out.println(ls);
    }
}
