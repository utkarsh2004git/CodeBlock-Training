public class NQueen {
    
    public static void main(String[] args) {

        boolean[][] arr = new boolean[4][4];
        ans(arr, 0, 0, 4);
    }
    public static void ans(boolean[][] arr, int row, int qpsf, int tq) {
        if (qpsf == tq) {
            print(arr);
            return;
        }

        for (int i = 0; i < arr[0].length; i++) {
            if (ispossible(arr, row, i)) {
                arr[row][i] = true;
                ans(arr, row + 1, qpsf + 1, tq);
                arr[row][i] = false;
            }
        }
    }

    private static boolean ispossible(boolean[][] arr, int row, int i) {
        

        int cr = row;
        int cc = i;
        while (cr >= 0) {
            if (arr[cr][cc] == true) {
                return false;
            }
            cr--;
        }

        cr = row;
        int a = cr;
        int b = cc;
        while (a >= 0 && b < arr[0].length) {
            if (arr[a][b] == true) {
                return false;
            }
            a--;
            b++;
        }
        a = cr;
        b = cc;

        while (a >= 0 && b >= 0) {
            if (arr[a][b] == true) {
                return false;
            }
            a--;
            b--;
        }
        return true;
    }

    private static void print(boolean[][] arr) {
        
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == true) {
                    ans += "Q";
                } else {
                    ans += ".";
                }
            }
            System.out.print(ans + "  ");
            ans = "";
            System.out.println();
        }


    }
}
