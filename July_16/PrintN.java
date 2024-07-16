public class PrintN {

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static int power2(int n){
        if(n==0) return 1;
        return 2*power2(n-1);
    }

    


    public static void main(String[] args) {
        // print(5);
        System.out.println(power2(5));
    }
}
