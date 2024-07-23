import java.util.*;

public class CombinationSum {

    public static void combinationSum(int arr[],int cs,int target,List<Integer> ls,int start){
        if(cs==target){
            System.out.println();
            return;
        }

        if(cs>target) return;

        for (int i = 0; i < arr.length; i++) {
            cs+=arr[i];
            ls.add(arr[i]);
            combinationSum(arr,cs,target,ls,i+1);
            cs-=arr[i];

        }
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        // combinationSum(arr,0,target,"",0);

        
    }

}
