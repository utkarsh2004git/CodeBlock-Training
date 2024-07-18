
public class CoinToss {


    public static void cointoss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        cointoss(n-1, ans+"H");
        cointoss(n-1, ans+"T");
    }
    
    //code for not consecutive H;
    
    public static void cointoss2(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            
            cointoss2(n-1, ans+"H");
        }
        cointoss2(n-1, ans+"T");
    }
    
    
    
    public static void main(String[] args) {
        cointoss(3,"");
        System.out.println();
        cointoss2(3,"");
    }

}
