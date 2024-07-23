public class IsPalindrome {
    


    public static void main(String[] args) {
        String s="abcba";
        int len=s.length();
        int flag=1;
        for(int i=0;i<=(len/2);i++){
            if(!(s.charAt(i)==(s.charAt(len-i-1)))){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
