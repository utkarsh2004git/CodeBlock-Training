

public class BoardQueen {


    // queen place so far - apsf

    public static void BoardPath(boolean arr[],int qpsf,int tq,String ans){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==false){
                arr[i]=true;
                BoardPath(arr, qpsf+1, tq,ans+"q"+qpsf+"b"+i+" ");
                arr[i]=false;
            }
        }
    }

    public static void main(String[] args) {
     
        boolean arr[] = new boolean[4];
        int qpsf=0;
        int tq=2;
        String ans="";
        BoardPath(arr, qpsf, tq, ans);
    }
}
