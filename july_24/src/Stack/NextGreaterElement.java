package Stack;
import java.util.*;
public class NextGreaterElement {



    public static void nge(int arr[],int ans[]){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]+" "+ans[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={11,2,-4,5,6,8,14,15};
        int ans[]=new int[arr.length];
        nge(arr,ans);
    }
}
