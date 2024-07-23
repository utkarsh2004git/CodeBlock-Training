import java.util.*;

public class PermutationLeetCode {

    public static List<List<Integer>> bigList= new ArrayList<>();
    
    public static void answer(int arr[],List<Integer> ll,boolean check[]){
        if(ll.size()==arr.length){
            bigList.add(new ArrayList<>(ll));
            return;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if(check[i]==false){
                check[i]=true;
                ll.add(arr[i]);
                answer(arr, ll, check);
                check[i]=false;
                ll.remove(ll.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        boolean check[]=new boolean[arr.length];
        List<Integer> ll= new ArrayList<>();
        answer(arr, ll, check);
        System.out.println(bigList);
    }
    
}
