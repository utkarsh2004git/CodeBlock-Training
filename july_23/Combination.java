import java.util.*;
public class Combination {

    public static void combine(int n,int k,String ans){
        if(k==0){
            System.out.println(ans);
            return;
        }
        if(n==0) return;
        combine(n-1,k,ans);
        combine(n-1,k-1,ans+n);
    }

    public static void combine1(int n,int k,List<Integer> ll,List<List<Integer>> bigList){
        if(k==0){
            bigList.add(new ArrayList<>(ll));
            return;
        }
        if(n==0) return;
        combine1(n-1,k,ll,bigList);
        ll.add(n);
        combine1(n-1,k-1,ll,bigList);
        ll.remove(ll.size()-1);
    }

    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> bigList=new ArrayList<>();
        combine1(4,2,ll,bigList);
        System.out.println(bigList);
    }
    
}
