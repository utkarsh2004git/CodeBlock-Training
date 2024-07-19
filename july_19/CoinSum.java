public class CoinSum {
    



    //infinite supply of coins

    public static void ans(int arr[],int cs,int target,String ans){
        if(cs==target){
            System.out.println(ans);
            return;
        }
        if(cs>target) return;

        for (int i = 0; i < arr.length; i++) {
            cs+=arr[i];
            ans(arr,cs,target,ans+arr[i]);
            cs-=arr[i];

        }
    }


    //finite supply of coins

    public static void ans2(int arr[],int cs,int target,String ans,int start){
        if(cs==target){
            System.out.println(ans);
            return;
        }
        if(cs>target) return;

        for (int i =start; i < arr.length; i++) {
            cs+=arr[i];
            ans2(arr,cs,target,ans+arr[i],i+1);
            cs-=arr[i];

        }
    }



    public static void main(String[] args) {
        
        int target=6;
        int arr[]={1,2,3,4,5};

        // ans(arr,0,target,"");

        ans2(arr,0,target,"",0);


    }
}
