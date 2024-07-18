public class HomeWork {

    public static void searchArray(int arr[],int n,int ele){
        if(n==0){
            System.out.println("Element not found");
            return;
        }    
        if(arr[n-1]==ele){
            System.out.println("Element found at index "+(n-1));
            return;
        }
         searchArray(arr, n-1, ele);
    }

    public static int sumArray(int arr[],int n){
    if(n==0) return 0;
    return arr[n-1]+sumArray(arr, n-1);
    }

    // public static int factorial(int n){

    //     return 
    // }
    

    public static void main(String[] args) {
        int n=5;
        int[] arr={1,2,3,4,5};
        // int ele=6;
        // searchArray(arr, n,ele);
        
        int sum=sumArray(arr, n);
        System.out.println("Sum of array : "+sum);

    }

}
