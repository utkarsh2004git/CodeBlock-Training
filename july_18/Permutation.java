

public class Permutation {
    
    public static void permu(String ques,String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<ques.length();i++){
            permu(ques.substring(0,i)+ques.substring(i+1),ans+ques.charAt(i));
        }
    }
    
    public static void main(String[] args) {
        String ques="123";
        permu(ques, "");
    }
}
