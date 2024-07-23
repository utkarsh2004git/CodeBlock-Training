public class BoardPath {
    
    public static void BoardPathCon(int target, String ans, int cs, int[] count) { // cs = current sum
        if (cs == target) {
            System.out.println(ans);
            count[0]++;
            return;
        }
        if (cs > target) {
            return;
        }

        for (int i = 1; i <= 3; i++) {
            BoardPathCon(target, ans + i, cs + i, count);
        }
    }
    public static void main(String[] args) {
        
    }
}
